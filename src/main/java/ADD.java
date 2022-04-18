import utils.User;
import utils.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/add")
public class ADD extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("userName");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        User user = new User(name,email,pass);
        UserDAO.create(user);
        response.sendRedirect("/user/list");

    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/add.jsp")
                .forward(request,response);


    }
}
