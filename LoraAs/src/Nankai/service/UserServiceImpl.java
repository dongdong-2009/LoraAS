package Nankai.service;

import java.util.UUID;

import Nankai.dao.UserDao;
import Nankai.domain.User;
import Nankai.factory.BasicFactory;

/*
 * 对UserService接口的实现
 * 
 * */
public class UserServiceImpl implements UserService {
	private UserDao dao = BasicFactory.getFactory().getInstance(UserDao.class);
	@Override
	//Server层调用dao层的接口实例进行对数据的查询
	public User getUserByNameAndPsw(String username, String password) {
		return dao.finUserByNameAndPsw(username,password);
	}
	@Override
	public void regist(User user) {
		//1.校验用户名是否存在
		//dao.findUserByName(user.getUsername());
		//2.调用dao层的方法添加到数据库
		
		//2.调用dao中的方法添加用户到数据库
		user.setRole("user");
		user.setState(0);
		user.setActivecode(UUID.randomUUID().toString());
		dao.addUser(user);
			
		
		
		//3.发送激活邮件
	}

}
