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
		// 1.��ȡҪɾ���Ŀͻ�id
		String id = request.getParameter("id");

		// 2.����service�и���idɾ���ͻ�

		service.delCustByID(id);

		// 3.����ת�����ͻ��б�ҳ��
		request.getRequestDispatcher("/servlet/ListCustServlet").forward(request, response);

	}

	public void init() throws ServletException {
	}

}
