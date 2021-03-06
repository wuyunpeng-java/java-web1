package wyp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:吴云鹏@Date:2020/11/22 - Time:23:01
 * @ DESCRIPTION 重定向
 * 此外，还有一种更简单的重定向的方法-->response.sendRedirect()
 */
@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Demo1.............");
//访问ResponseDemo1会自动跳转到ResponseDemo2
//        1 设置状态码302
        response.setStatus(302);
//        2 设置响应头location
        response.setHeader("location","/web1/m1");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
