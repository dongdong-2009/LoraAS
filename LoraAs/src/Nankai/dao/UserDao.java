package Nankai.dao;

import Nankai.domain.User;

public interface UserDao {

	/**
	 * �����û�������������û�
	 * @param username
	 * @param password
	 * @return
	 */
	User finUserByNameAndPsw(String username, String password);

	/**
	 * �����û��������û�
	 * @param username
	 */
	User findUserByName(String username);

	/**
	 * UserBean��ӿͻ�
	 * @param user
	 */
	void addUser(User user);

}
