package Nankai.service;

import java.util.List;

import Nankai.domain.Page;
import Nankai.domain.gateway;

public interface GatewayService {
	
	/**
	 * @return
	 * 得到所有的网关信息
	 */

	List<gateway> getAllgateway();
	
	List<gateway> getGatewayList(Page pager);
	
	

}
