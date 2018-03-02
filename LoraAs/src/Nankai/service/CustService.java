package Nankai.service;



import java.util.List;

import Nankai.domain.Cust;


public interface CustService {

	/**
	 * 添加客户
	 * @param cust 封装了用户信息的bean
	 */
	void addCust(Cust cust);
	
	
	/**
	 * 查询所有客户信息
	 * @param return
	 */
	List<Cust> getAllCust();
	
	/**
	 * 根据id查找客户信息
	 * @param 查找不到返回null
	 */

	Cust findCustById(String id);

	/**
	 * 修改客户信息
	 * @param cust
	 */
	void updateCust(Cust cust);

	/**
	 * 删除客户信息
	 * @param id
	 * @return null
	 */
	void delCustByID(String id);

	/**
	 * 批量删除客户信息 其中进行事物管理
	 * @param id
	 * @return null
	 */
	void batchDel(String[] ids);


}
