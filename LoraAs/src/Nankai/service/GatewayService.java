package Nankai.service;

import java.util.List;

import Nankai.domain.Page;
import Nankai.domain.gateway;

public interface GatewayService {
	
	/**
	 * @return
	 * �õ����е�������Ϣ
	 */

	List<gateway> getAllgateway();
	
	List<gateway> getGatewayList(Page pager);
	
	

}
