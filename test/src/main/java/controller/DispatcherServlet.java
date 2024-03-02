package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.MemberDao;
import dto.Member;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DispatcherServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
		
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));

		if (path.equals("/login.do")) {
			try {
				String id = request.getParameter("id");
				String email = request.getParameter("email");
				String remember = request.getParameter("remember-me");
				Member member = MemberDao.getInstance().selectForLogin(id, email);
				if (member != null) {
					HttpSession session = request.getSession();
					session.setAttribute("member", member);
					if (remember != null && remember.equals("on")) {
						Cookie cookie = new Cookie("id", id);
						cookie.setMaxAge(60);
						response.addCookie(cookie);
					} else {
						Cookie cookie = new Cookie("id", null);
						cookie.setMaxAge(0);
						response.addCookie(cookie);
					}
					response.sendRedirect("../member/memberPage.jsp");
				} else {
					response.sendRedirect("loginForm.jsp");
				}
			} catch (Exception e) {
				e.printStackTrace();
				response.getWriter().println("오류가 발생했습니다: " + e.getMessage());
			} return;

		} else if (path.equals("/logout.do")) {
			HttpSession session = request.getSession(false);
			session.invalidate();
			response.sendRedirect("loginForm.jsp");
			response.sendRedirect("memberJoinForm.jsp");
		} else if (path.equals("/join.do")) {
			String id = request.getParameter("id");
			String email = request.getParameter("email");
			String name = request.getParameter("name");
			Member member1 = MemberDao.getInstance().select(id);
			if (member1 != null && member1.getId().equals(id)) {
				HttpSession session = request.getSession();
		        session.setAttribute("failMessage", "이미 등록된 아이디입니다");
				response.sendRedirect("memberJoinForm.jsp");
			} else if (member1 == null) {
				Member member = new Member(id,email,name);
				MemberDao.getInstance().insert(member);
				HttpSession session = request.getSession();
		        session.setAttribute("successMessage", "회원가입이 완료되었습니다. 로그인하세요");
				response.sendRedirect("../login/loginForm.jsp");
			}
		}
	}
}
