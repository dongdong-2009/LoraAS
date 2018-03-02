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

		// 1.��ȡ����Ҫɾ���Ŀͻ�id
		String ids[] = request.getParameterValues("delId");

		// 2.����Service������ɾ���ͻ��ķ���
		service.batchDel(ids);
		// 3.�ض��򵽿ͻ�ҳ��
		request.getRequestDispatcher("/servlet/ListCustServlet").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	public void init() throws ServletException {
	}

}
