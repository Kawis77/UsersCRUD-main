import utils.User;
import utils.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/list")
public class UserList extends HttpServlet {

    //ss
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        UserDAO.createUserTable();

        UserDAO userDAO = new UserDAO();
        request.setAttribute("users", userDAO.findAll());
        getServletContext().getRequestDispatcher("/users/list.jsp")
                .forward(request, response);

    }
}