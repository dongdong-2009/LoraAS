package Nankai.service;

import java.util.UUID;

import Nankai.dao.UserDao;
import Nankai.domain.User;
import Nankai.factory.BasicFactory;

/*
 * ��UserService�ӿڵ�ʵ��
 * 
 * */
public class UserServiceImpl implements UserService {
	private UserDao dao = BasicFactory.getFactory().getInstance(UserDao.class);
	@Override
	//Server�����dao��Ľӿ�ʵ�����ж����ݵĲ�ѯ
	public User getUserByNameAndPsw(String username, String password) {
		return dao.finUserByNameAndPsw(username,password);
	}
	@Override
	public void regist(User user) {
		//1.У���û����Ƿ����
		//dao.findUserByName(user.getUsername());
		//2.����dao��ķ�����ӵ����ݿ�
		
		//2.����dao�еķ�������û������ݿ�
		user.setRole("user");
		user.setState(0);
		user.setActivecode(UUID.randomUUID().toString());
		dao.addUser(user);
			
		
		
		//3.���ͼ����ʼ�
	}

}
