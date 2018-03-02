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
 * 处理注册信息
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
		//1.校验验证码
		String valistr1 = request.getParameter("valistr");
		String valistr2 = (String) request.getSession().getAttribute("valistr");
		if(valistr1 == null || valistr2 == null || !valistr1.equals(valistr2)){
			request.setAttribute("msg", "<font color='red'>验证码不正确!</font>");
			System.out.println(valistr1+""+valistr2);
			request.getRequestDispatcher("/regist.jsp").forward(request, response);
			return;
		}
		//2.封装数据，校验数据
		User user=new User();
		
		BeanUtils.populate(user, request.getParameterMap());
		
		//3.调用Service注册用户
		service.regist(user);
		
		
		
		
		//4.回到主页
		response.getWriter().write("注册成功，请到邮箱进行激活");
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
