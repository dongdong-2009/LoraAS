package Nankai.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/*import java.util.List;

import Nankai.domain.Cust;

public interface CustDao {

	Cust FindUserByName(String name);

	void addCust(Cust cust);
	
}
*/



import Nankai.domain.Cust;



public interface CustDao {

	/**
	 * 根据用户名查找用户
	 * @param name 用户名
	 * @return 找到的用户,如果找不到返回null
	 */
	Cust findUserByName(String name);

	/**
	 * 添加客户
	 * @param cust
	 */
	void addCust(Cust cust);
	
	/**
	 * 查询客户信息集合
	 * @param 封装所有客户信息集合，如果没有返回空
	 */
	List<Cust> getAllcust();
	
	/**
	 * 根据用户名查找用户
	 * @param id id
	 * @return 找到的用户,如果找不到返回null
	 */
	Cust findUserById(String id);
	
	
	/**
	 * 更新数据
	 * @return null
	 */
	void updateCust(Cust cust);
	
	
	/**
	 * 删除数据
	 * @return null
	 */
	void delCustByID(String id);
	
	/**
	 * 批量删除数据
	 * @param conn 
	 * @return null
	 * 
	 */

	void delCustByIDWithTrans(Connection conn, String id) throws SQLException;

	
	
}
