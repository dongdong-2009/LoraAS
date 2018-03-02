package Nankai.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Nankai.domain.Cust;
import Nankai.factory.BasicFactory;
import Nankai.service.CustService;

public class CusInfoServlet extends HttpServlet {
	public CusInfoServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustService service=BasicFactory.getFactory().getInstance(CustService.class);
		
		
		
		//1.获取要查询的客户id
		String id=request.getParameter("id");
		
		
		
		//2.调用Service中根据id查找客户的方法
		Cust cust=service.findCustById(id);
		if(cust==null){
			throw new RuntimeException("找不到该客户");
		}
		
		
		//3.将查找到的客户信息存到request域中，请求转发到updateCuset.jsp页面中
		request.setAttribute("cust",cust);
		request.getRequestDispatcher("/updateCust.jsp").forward(request, response);
		
		
		
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	public void init() throws ServletException {
		
	}

}
