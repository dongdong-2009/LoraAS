package Nankai.service;



import java.util.List;

import Nankai.domain.Cust;


public interface CustService {

	/**
	 * ��ӿͻ�
	 * @param cust ��װ���û���Ϣ��bean
	 */
	void addCust(Cust cust);
	
	
	/**
	 * ��ѯ���пͻ���Ϣ
	 * @param return
	 */
	List<Cust> getAllCust();
	
	/**
	 * ����id���ҿͻ���Ϣ
	 * @param ���Ҳ�������null
	 */

	Cust findCustById(String id);

	/**
	 * �޸Ŀͻ���Ϣ
	 * @param cust
	 */
	void updateCust(Cust cust);

	/**
	 * ɾ���ͻ���Ϣ
	 * @param id
	 * @return null
	 */
	void delCustByID(String id);

	/**
	 * ����ɾ���ͻ���Ϣ ���н����������
	 * @param id
	 * @return null
	 */
	void batchDel(String[] ids);


}
