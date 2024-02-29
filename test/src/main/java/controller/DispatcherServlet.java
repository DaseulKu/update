package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.BoardDao;
import dao.MemberDao;
import dto.Board;
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
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		
		if (path.equals("/blist.do")) {
			BoardDao dao = BoardDao.getInstance();
			ArrayList<Board> blist = dao.selectList();

			request.setAttribute("blist", blist);
			RequestDispatcher dispatcher = request.getRequestDispatcher("boardList.jsp");
			dispatcher.forward(request, response);

		} else if (path.equals("/view.do")) {
			int num = Integer.parseInt(request.getParameter("num"));
			BoardDao dao = BoardDao.getInstance();
			Board board = dao.selectOne(num, true);

			String title = board.getTitle().replace(" ", "&nbsp;");
			board.setTitle(title);

			String content = board.getContent().replace(" ", "&nbsp;").replace("\n", "<br>");
			board.setContent(content);

			request.setAttribute("board", board);
			RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
			dispatcher.forward(request, response);

		} else if (path.equals("/login.do")) {
			String id = request.getParameter("id");
			String email = request.getParameter("email");
			String remember = request.getParameter("remember-me");
			Member member = MemberDao.getInstance().selectForLogin(id, email);
			if (member != null) {
				HttpSession session = request.getSession();
				session.setAttribute("member", member);
				if (remember != null && remember.equals("on")) {
					Cookie cookie = new Cookie("email", email);
					cookie.setMaxAge(60);
					response.addCookie(cookie);
				} else {
					Cookie cookie = new Cookie("email", null);
					cookie.setMaxAge(0);
					response.addCookie(cookie);
			}
				response.sendRedirect("memberMain.jsp");
			} else {
				response.sendRedirect("loginForm.jsp");
			}
			
		} else if (path.equals("/logout.do")) {
			HttpSession session = request.getSession(false);
			session.invalidate();
			response.sendRedirect("loginForm.jsp");	
			
		} else if (path.equals("/join.do")) {
			String id = request.getParameter("id");
			Member member1 = MemberDao.getInstance().select(id);
			if (member1 != null && member1.getId().equals(id)) {
				response.sendRedirect("memberJoinForm.jsp");
			}else if (member1 == null) {
				Member member = new Member(request.getParameter("id"), request.getParameter("email"), request.getParameter("name"));
				MemberDao.getInstance().insert(member);
				HttpSession session = request.getSession();
				session.setAttribute("member", member);
				response.sendRedirect("loginForm.jsp");
			}
		}
	}
}
