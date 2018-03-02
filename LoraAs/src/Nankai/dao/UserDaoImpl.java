package Nankai.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import Nankai.dbutilis.DaoUtils;
import Nankai.domain.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User finUserByNameAndPsw(String username, String password) {
		String sql="select * from users where username = ? and password = ?"; //执行的sql语句
		QueryRunner runner=new QueryRunner(DaoUtils.getSource());  //得到执行sql的runner
		try {
			return runner.query(sql,new BeanHandler<User>(User.class) ,username ,password);//username password对应上面的问号
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public User findUserByName(String username) {
		String sql="select*from users where username=?";
		QueryRunner runner=new QueryRunner(DaoUtils.getSource());
		try {
			return runner.query(sql,new BeanHandler<User>(User.class) ,username );//username password对应上面的问号
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	
	@Override
	public void addUser(User user) {
		String sql="insert to users values(null,?,?,?,?,?,?,?,null)";
		QueryRunner runner=new QueryRunner(DaoUtils.getSource());
		try {
			runner.update(sql,new BeanHandler<User>(User.class),user.getUsername(),user.getPassword(),user.getNickname(),user.getEmail(),user.getRole(),user.getState(),user.getActivecode());
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
