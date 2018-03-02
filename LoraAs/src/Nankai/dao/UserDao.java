package Nankai.dao;

import Nankai.domain.User;

public interface UserDao {

	/**
	 * 根据用户名和密码查找用户
	 * @param username
	 * @param password
	 * @return
	 */
	User finUserByNameAndPsw(String username, String password);

	/**
	 * 根据用户名查找用户
	 * @param username
	 */
	User findUserByName(String username);

	/**
	 * UserBean添加客户
	 * @param user
	 */
	void addUser(User user);

}
