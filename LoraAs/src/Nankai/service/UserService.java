package Nankai.service;

import Nankai.domain.User;

public interface UserService {

	/**
	 * ���û����������user
	 * @param username
	 * @param password
	 * @return
	 */
	User getUserByNameAndPsw(String username, String password);

	/**
	 * ע���û�
	 * @param user
	 */
	void regist(User user);

}
