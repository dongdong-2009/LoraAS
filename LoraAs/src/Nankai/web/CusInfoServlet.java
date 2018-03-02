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
		
		
		
		//1.��ȡҪ��ѯ�Ŀͻ�id
		String id=request.getParameter("id");
		
		
		
		//2.����Service�и���id���ҿͻ��ķ���
		Cust cust=service.findCustById(id);
		if(cust==null){
			throw new RuntimeException("�Ҳ����ÿͻ�");
		}
		
		
		//3.�����ҵ��Ŀͻ���Ϣ�浽request���У�����ת����updateCuset.jspҳ����
		request.setAttribute("cust",cust);
		request.getRequestDispatcher("/updateCust.jsp").forward(request, response);
		
		
		
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	public void init() throws ServletException {
		
	}

}
