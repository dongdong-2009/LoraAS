package Nankai.web;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Nankai.dbutilis.MD5Utils;
import Nankai.domain.User;
import Nankai.factory.BasicFactory;
import Nankai.service.UserService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ͨ�������õ�ʵ��
		UserService service = BasicFactory.getFactory().getInstance(UserService.class);
		// 1.��ȡ�û�������
		String username = request.getParameter("username");// �õ��û���
		String password = MD5Utils.md5(request.getParameter("password"));// �õ����룬Ȼ����������
		// 2.����Service�и����û�����������û��ķ���
		User user = service.getUserByNameAndPsw(username, password);
		if (user == null) {
			request.setAttribute("msg", "�û������벻��ȷ");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		// 3.����û�����״̬
		if (user.getState() == 0) {
			request.setAttribute("msg", "�û���δ����뵽�����н��м���");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}

		// 4.��½���ض�����ҳ
		request.getSession().setAttribute("user", user); // ���û���Ϣ���뵽session����
		// --�����ס�û���
		if ("true".equals(request.getParameter("remname"))) {
			Cookie remnameC = new Cookie("remname", URLEncoder.encode(user.getUsername(), "utf-8"));
			remnameC.setPath("/");
			remnameC.setMaxAge(3600 * 24 * 30);
			response.addCookie(remnameC);
		} else {
			Cookie remnameC = new Cookie("remname", "");
			remnameC.setPath("/");
			remnameC.setMaxAge(0);
			response.addCookie(remnameC);
		}

		// --����30�����Զ���½
		if ("true".equals(request.getParameter("autologin"))) {
			Cookie autologinC = new Cookie("autologin",
					URLEncoder.encode(user.getUsername() + ":" + user.getPassword(), "utf-8"));
			autologinC.setPath("/");
			autologinC.setMaxAge(3600 * 24 * 30);
			response.addCookie(autologinC);
		}

		response.sendRedirect("/index.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
