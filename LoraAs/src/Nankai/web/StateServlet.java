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
	 * @see 用户状态显示
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GatewayService service=BasicFactory.getFactory().getInstance(GatewayService.class);
		// 1.调用Service中查询所有客户的方法，查询到所有客户
		//List<Gateway> gatewaylist = service.getAllgateway();
		
		
		//-------------分页开始----------------------
		String currentpage=request.getParameter("currentpage");
		
		//判断是否为第一次访问
		if(currentpage==null||"".equals(currentpage.trim())){
			currentpage="1";
		}
		int CurrentPage=Integer.parseInt(currentpage);//得到当前的页数
		
		Page pager=new Page();
		pager.setCurrentPage(CurrentPage);//填充Page
	
		List<gateway> gatewaylist=service.getGatewayList(pager); //调用service，去dao层查找数据
		//List<gateway> gatewaylist=service.getAllgateway();
		
		
		request.setAttribute("pager",pager);
		
		
		
		//-------------分页结束----------------------
		
		

		// 2.将查询到的信息存入到request域中，请求转发到ListCust.jsp页面进行展示
		request.setAttribute("gatewaylist", gatewaylist);
		request.getRequestDispatcher("/gatewaylist.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
