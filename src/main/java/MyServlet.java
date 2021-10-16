import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/method")
public class MyServlet extends HttpServlet {

    /**
     * Метод GET
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("<h1>Method:" + req.getMethod() + "</h1>");
        outputStream.close();
    }

    /**
     * Метод POST
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("<h1>Method:" + req.getMethod() + "</h1>");
        outputStream.close();
    }

    /**
     * Метод PUT
     */
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("<h1>Method:" + req.getMethod() + "</h1>");
        outputStream.close();
    }

    /**
     * Метод DELETE
     */
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("<h1>Method:" + req.getMethod() + "</h1>");
        outputStream.close();
    }
}
