package Nankai.web;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import Nankai.domain.Cust;
import Nankai.factory.BasicFactory;
import Nankai.service.CustService;

public class AddCust extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		CustService service = BasicFactory.getFactory().getInstance(CustService.class);
		try{
			//1.��װ����У������
			Cust cust = new Cust();
			BeanUtils.populate(cust, request.getParameterMap());
				//--����������
			String [] prefs = request.getParameterValues("preference");
			StringBuffer buffer = new StringBuffer();
			for(String pref : prefs){
				buffer.append(pref+",");
			}
			String pref = buffer.substring(0, buffer.length()-1);
			cust.setPreference(pref);
			//2.����Service�еķ�����ӿͻ�
			service.addCust(cust);
			//3.�ض���ص���ҳ
			response.sendRedirect(request.getContextPath()+"/CustIndex.jsp");
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

