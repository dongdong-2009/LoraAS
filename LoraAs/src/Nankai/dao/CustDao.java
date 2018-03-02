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
	 * �����û��������û�
	 * @param name �û���
	 * @return �ҵ����û�,����Ҳ�������null
	 */
	Cust findUserByName(String name);

	/**
	 * ��ӿͻ�
	 * @param cust
	 */
	void addCust(Cust cust);
	
	/**
	 * ��ѯ�ͻ���Ϣ����
	 * @param ��װ���пͻ���Ϣ���ϣ����û�з��ؿ�
	 */
	List<Cust> getAllcust();
	
	/**
	 * �����û��������û�
	 * @param id id
	 * @return �ҵ����û�,����Ҳ�������null
	 */
	Cust findUserById(String id);
	
	
	/**
	 * ��������
	 * @return null
	 */
	void updateCust(Cust cust);
	
	
	/**
	 * ɾ������
	 * @return null
	 */
	void delCustByID(String id);
	
	/**
	 * ����ɾ������
	 * @param conn 
	 * @return null
	 * 
	 */

	void delCustByIDWithTrans(Connection conn, String id) throws SQLException;

	
	
}
