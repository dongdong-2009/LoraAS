package Nankai.dao;

import java.util.List;

import Nankai.domain.Page;
import Nankai.domain.gateway;

public interface GatewayDao {

	/**
	 * @return
	 * �õ����ص���Ϣ
	 */
	List<gateway> getAllgateway();

	List<gateway> getGatewayList(Page pager);
	
}
