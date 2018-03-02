package Nankai.service;

import Nankai.domain.User;

public interface UserService {

	/**
	 * 由用户名密码查找user
	 * @param username
	 * @param password
	 * @return
	 */
	User getUserByNameAndPsw(String username, String password);

	/**
	 * 注册用户
	 * @param user
	 */
	void regist(User user);

}
