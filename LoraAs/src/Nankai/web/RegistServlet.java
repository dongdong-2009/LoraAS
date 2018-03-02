package Nankai.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.basic.BasicIconFactory;

import org.apache.commons.beanutils.BeanUtils;

import Nankai.domain.User;
import Nankai.factory.BasicFactory;
import Nankai.service.UserService;


/**
 * @author ly
 * ����ע����Ϣ
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegistServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService service=BasicFactory.getFactory().getInstance(UserService.class);
		try{
		//1.У����֤��
		String valistr1 = request.getParameter("valistr");
		String valistr2 = (String) request.getSession().getAttribute("valistr");
		if(valistr1 == null || valistr2 == null || !valistr1.equals(valistr2)){
			request.setAttribute("msg", "<font color='red'>��֤�벻��ȷ!</font>");
			System.out.println(valistr1+""+valistr2);
			request.getRequestDispatcher("/regist.jsp").forward(request, response);
			return;
		}
		//2.��װ���ݣ�У������
		User user=new User();
		
		BeanUtils.populate(user, request.getParameterMap());
		
		//3.����Serviceע���û�
		service.regist(user);
		
		
		
		
		//4.�ص���ҳ
		response.getWriter().write("ע��ɹ����뵽������м���");
		response.setHeader("Refresh", "3,url=/index.jsp");
		
		
		
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
