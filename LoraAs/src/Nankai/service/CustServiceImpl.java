package Nankai.service;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;

import Nankai.dao.CustDao;
import Nankai.dbutilis.DaoUtils;
import Nankai.domain.Cust;
import Nankai.factory.BasicFactory;

public class CustServiceImpl implements CustService {
	CustDao dao = BasicFactory.getFactory().getInstance(CustDao.class);

	public void addCust(Cust cust) {
		// 1.检查用户名是否已经存在
		if (dao.findUserByName(cust.getName()) != null) {
			throw new RuntimeException("用户名已经存在!!");
		}
		// 2.调用dao中的方法增加用户
		dao.addCust(cust);
	}

	@Override
	public List<Cust> getAllCust() {
		return dao.getAllcust();
	}

	@Override
	public Cust findCustById(String id) {
		return dao.findUserById(id);
	}

	@Override
	public void updateCust(Cust cust) {
		dao.updateCust(cust);
	}

	@Override
	public void delCustByID(String id) {
		dao.delCustByID(id);
	}

	@Override
	public void batchDel(String[] ids) {
		Connection conn = DaoUtils.getConn();
		try{
			conn.setAutoCommit(false);
			for(String id : ids){
				dao.delCustByIDWithTrans(conn,id);
			}
			DbUtils.commitAndCloseQuietly(conn);
		}catch (Exception e) {
			DbUtils.rollbackAndCloseQuietly(conn);
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
