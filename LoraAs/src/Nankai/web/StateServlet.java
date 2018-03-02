package Nankai.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Nankai.domain.Cust;
import Nankai.domain.Page;
import Nankai.domain.gateway;
import Nankai.factory.BasicFactory;
import Nankai.service.CustService;
import Nankai.service.GatewayService;

/**
 * Servlet implementation class StateServlet
 */
@WebServlet("/StateServlet")
public class StateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see �û�״̬��ʾ
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GatewayService service=BasicFactory.getFactory().getInstance(GatewayService.class);
		// 1.����Service�в�ѯ���пͻ��ķ�������ѯ�����пͻ�
		//List<Gateway> gatewaylist = service.getAllgateway();
		
		
		//-------------��ҳ��ʼ----------------------
		String currentpage=request.getParameter("currentpage");
		
		//�ж��Ƿ�Ϊ��һ�η���
		if(currentpage==null||"".equals(currentpage.trim())){
			currentpage="1";
		}
		int CurrentPage=Integer.parseInt(currentpage);//�õ���ǰ��ҳ��
		
		Page pager=new Page();
		pager.setCurrentPage(CurrentPage);//���Page
	
		List<gateway> gatewaylist=service.getGatewayList(pager); //����service��ȥdao���������
		//List<gateway> gatewaylist=service.getAllgateway();
		
		
		request.setAttribute("pager",pager);
		
		
		
		//-------------��ҳ����----------------------
		
		

		// 2.����ѯ������Ϣ���뵽request���У�����ת����ListCust.jspҳ�����չʾ
		request.setAttribute("gatewaylist", gatewaylist);
		request.getRequestDispatcher("/gatewaylist.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
