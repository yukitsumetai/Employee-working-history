import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/Login"})
public class HelloServelet extends HttpServlet {
ServerApp server = new ServerApp();

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("web/index.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
boolean test =server.login(login, password);
        if(test){
            request.getRequestDispatcher("web/WEB-INF/Views/index.jsp").forward(request, response);
        }
        else {
            request.setAttribute("s", "Bad credentials" );
            request.getRequestDispatcher("web/index.jsp").forward(request, response);
        }

    }

}
