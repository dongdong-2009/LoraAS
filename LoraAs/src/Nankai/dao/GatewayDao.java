package Nankai.dao;

import java.util.List;

import Nankai.domain.Page;
import Nankai.domain.gateway;

public interface GatewayDao {

	/**
	 * @return
	 * 得到网关的信息
	 */
	List<gateway> getAllgateway();

	List<gateway> getGatewayList(Page pager);
	
}
