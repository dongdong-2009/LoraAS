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
	 * @see Nankai.service.GatewayService#getAllgateway() �õ����е�������Ϣ
	 */
	@Override
	public List<gateway> getAllgateway() {
		List<gateway> list = null;
		// 1.�õ�session
		Session session = HibernateUtils.getCurrentSession();
		
		// 2.������
		Transaction tx = session.beginTransaction();
		try {
			list = dao.getAllgateway();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

		tx.commit();
		// 3.�ύ����
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Nankai.service.GatewayService#getGatewayList(Nankai.domain.Page)
	 * 
	 * ��ҳ�õ����ص���Ϣ
	 * 
	 */
	@Override
	public List<gateway> getGatewayList(Page pager) {
		List<gateway> list = null;
		// 1.�õ�session
		Session session = HibernateUtils.getCurrentSession();
		
		// 2.������
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
