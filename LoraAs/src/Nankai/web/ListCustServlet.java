package Nankai.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Nankai.domain.Cust;
import Nankai.domain.gateway;
import Nankai.factory.BasicFactory;
import Nankai.service.CustService;
import Nankai.service.GatewayService;

public class ListCustServlet extends HttpServlet {
	public ListCustServlet() {
		super();
	}

	public void destroy() {
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GatewayService service=BasicFactory.getFactory().getInstance(GatewayService.class);
		
		//1.����Service�в�ѯ���пͻ��ķ�������ѯ����������
		List<gateway> gatewaylist=service.getAllgateway();
		
		//2.����ѯ������Ϣ���뵽request���У�����ת����ListCust.jspҳ�����չʾ
		request.setAttribute("gatewaylist", gatewaylist);
		request.getRequestDispatcher("/gatewaylist.jsp").forward(request, response);
		//request.setAttribute("list", list);
		//request.getRequestDispatcher("/listCust.jsp").forward(request, response);
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	public void init() throws ServletException {
	}

}
