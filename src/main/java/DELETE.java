import utils.User;
import utils.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/user/delete")
public class DELETE extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        UserDAO.delete((int)(session.getAttribute("id")));
        response.sendRedirect("/user/list");

    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        HttpSession session = request.getSession();
        session.setAttribute("id", id);
//        response.getWriter().println("<form method=\"post\" action=\"/user/delete\">" +
//                "<input type=\"submit\" value=\"Potwierdź usunięcie\">"+
//                "</form>");

        getServletContext().getRequestDispatcher("/WEB-INF/delete.jsp")
                .forward(request,response);

    }
}
