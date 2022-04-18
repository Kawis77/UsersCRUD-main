import utils.User;
import utils.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/user/edit")
public class EDIT extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String userName = request.getParameter("userName");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        User user = (User) session.getAttribute("user");
        user.setEmail(email);
        user.setUserName(userName);
        user.setPassword(pass);
        UserDAO.update(user);
        response.sendRedirect("/user/list");

    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        User user = UserDAO.read(id);
        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        getServletContext().getRequestDispatcher("/WEB-INF/edit.jsp")
                .forward(request,response);

//        response.getWriter().println("<form method=\"post\" action=\"/user/edit\">\n" +
//                "    <label>\n" +
//                "        Nazwa użytkownika\n" +
//                "    </label>\n" +
//                "    <input type=\"text\" name=\"userName\" value=\"" + user.getUserName() + "\" placeholder=\"userName\"><br>\n" +
//                "    <label>\n" +
//                "        Email:\n" +
//                "    </label>\n" +
//                "    <input type=\"text\" name=\"email\" value=\"" + user.getEmail() + "\" placeholder=\"email\"><br>\n" +
//                        "<label>\n" +
//                "        Hasło:\n" +
//                        "    </label>\n" +
//                "    <input type=\"text\" name=\"pass\" placeholder=\"passowrd\"><br>\n" +
//                "    <input type=\"submit\" value=\"Edytuj\">\n" +
//                "\n" +
//                "</form>");
    }
}