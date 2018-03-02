package Nankai.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Nankai.factory.BasicFactory;
import Nankai.service.CustService;

public class BatchDelServlet extends HttpServlet {
	public BatchDelServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustService service = BasicFactory.getFactory().getInstance(CustService.class);

		// 1.获取所有要删除的客户id
		String ids[] = request.getParameterValues("delId");

		// 2.调用Service中批量删除客户的方法
		service.batchDel(ids);
		// 3.重定向到客户页面
		request.getRequestDispatcher("/servlet/ListCustServlet").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	public void init() throws ServletException {
	}

}
