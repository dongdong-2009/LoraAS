package Nankai.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Nankai.factory.BasicFactory;
import Nankai.service.CustService;

public class DelCustServlet extends HttpServlet {
	public DelCustServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustService service = BasicFactory.getFactory().getInstance(CustService.class);
		// 1.获取要删除的客户id
		String id = request.getParameter("id");

		// 2.调用service中根据id删除客户

		service.delCustByID(id);

		// 3.请求转发到客户列表页面
		request.getRequestDispatcher("/servlet/ListCustServlet").forward(request, response);

	}

	public void init() throws ServletException {
	}

}
