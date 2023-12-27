package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("*.us")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// 한글이 깨지지 않도록
		request.setCharacterEncoding("UTF-8");
		
		// 1.
		String uri = request.getRequestURI();
		// System.out.println(uri);
		String path = uri.substring(uri.lastIndexOf("/"));
		// System.out.println(path);
		
		if (path.equals("/login.us")) {
			System.out.println("login.us 요청 처리");
			
			
			
			
		}else if (path.equals("/insertUsers.us")) {
			System.out.println("insertUsers.us 요청 처리");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
