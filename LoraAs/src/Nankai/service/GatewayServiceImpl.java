package Nankai.service;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Nankai.dao.CustDao;
import Nankai.dao.GatewayDao;
import Nankai.dbutilis.HibernateUtils;
import Nankai.domain.Page;
import Nankai.domain.gateway;
import Nankai.factory.BasicFactory;

public class GatewayServiceImpl implements GatewayService {

	GatewayDao dao = BasicFactory.getFactory().getInstance(GatewayDao.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see Nankai.service.GatewayService#getAllgateway() 得到所有的网关信息
	 */
	@Override
	public List<gateway> getAllgateway() {
		List<gateway> list = null;
		// 1.得到session
		Session session = HibernateUtils.getCurrentSession();
		
		// 2.打开事务
		Transaction tx = session.beginTransaction();
		try {
			list = dao.getAllgateway();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

		tx.commit();
		// 3.提交事物
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Nankai.service.GatewayService#getGatewayList(Nankai.domain.Page)
	 * 
	 * 翻页得到网关的信息
	 * 
	 */
	@Override
	public List<gateway> getGatewayList(Page pager) {
		List<gateway> list = null;
		// 1.得到session
		Session session = HibernateUtils.getCurrentSession();
		
		// 2.打开事务
		Transaction tx = session.beginTransaction();
		
		try {
		list=dao.getGatewayList(pager);
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		tx.commit();
		return list;
	}
}
