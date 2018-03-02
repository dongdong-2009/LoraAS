package Nankai.dao;

import java.util.List;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Nankai.dbutilis.DaoUtils;
import Nankai.dbutilis.HibernateUtils;
import Nankai.domain.Cust;
import Nankai.domain.Page;
import Nankai.domain.gateway;

public class GatewayDaoImpl implements GatewayDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see Nankai.dao.GatewayDao#getAllgateway() dao��ľ���ʵ�֣��������е�������Ϣ
	 */
	@Override
	public List<gateway> getAllgateway() {
		
		/*String sql = "select * from gatewayall";
		try{
			QueryRunner runner=new QueryRunner(DaoUtils.getSource());
			return	runner.query(sql, new BeanListHandler<Gateway>(Gateway.class));
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}*/
		
		Session session=HibernateUtils.getCurrentSession();
		
		Transaction tx=session.beginTransaction();
		
		//ִ�в�ѯ���
		Query query=session.createQuery("from gateway");
		
		List<gateway> list=query.list();
		return list;
		
		
	}
	

	@Override
	public List<gateway> getGatewayList(Page pager) {
		//�õ��ܼ�¼��
		int TotalRecord=getAllgateway().size();
		pager.setRecordTotal(TotalRecord);
		/*
		String sql = "select * from gatewayall limit ?,?";
		try{
			QueryRunner runner=new QueryRunner(DaoUtils.getSource());
			return	runner.query(sql, new BeanListHandler<Gateway>(Gateway.class),(pager.getCurrentPage()*pager.getPageSize()-1),pager.getPageSize());
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
		 */		
		//ʹ��Hibernate���з�ҳ��ѯ
		Session session=HibernateUtils.getCurrentSession();
		
		Transaction tx=session.beginTransaction();
		
		Criteria query=session.createCriteria(gateway.class);
		
		//Query query=session.createQuery(HQL);
		query.setMaxResults(pager.getPageSize());
		query.setFirstResult(pager.getCurrentPage()*pager.getPageSize()-2);
		
		List<gateway> list=query.list();
		
		return list;
	}

	
}
