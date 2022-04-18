import utils.User;
import utils.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/user/show")
public class SHOW extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter("id"));
        User user = UserDAO.read(id);
        session.setAttribute("user",user);

        getServletContext().getRequestDispatcher("/WEB-INF/show.jsp")
                .forward(request,response);


    }
}
