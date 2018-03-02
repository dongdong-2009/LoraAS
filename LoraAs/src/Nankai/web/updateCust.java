package Nankai.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import Nankai.domain.Cust;
import Nankai.factory.BasicFactory;
import Nankai.service.CustService;

public class updateCust extends HttpServlet {

	public updateCust() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		CustService service = BasicFactory.getFactory().getInstance(CustService.class);
		try{
			//1.封装数据校验数据
			Cust cust = new Cust();
			BeanUtils.populate(cust, request.getParameterMap());
				//--单独处理爱好
			String [] prefs = request.getParameterValues("preference");
			StringBuffer buffer = new StringBuffer();
			for(String pref : prefs){
				buffer.append(pref+",");
			}
			String pref = buffer.substring(0, buffer.length()-1);
			cust.setPreference(pref);
			//2.调用Service中修改客户信息的方法
			service.updateCust(cust);
			//3.重定向到客户列表页面
			response.sendRedirect(request.getContextPath()+"/servlet/ListCustServlet");
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public void init() throws ServletException {
	}

}
