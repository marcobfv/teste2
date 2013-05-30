import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class comentario extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		PrintWriter saida = res.getWriter();
		saida.println("<html>");
		saida.println("<title>Servlet</title>");
		saida.println("<body>");
		saida.println("Hello Mr. Dog");
		saida.println("</body>");
		saida.println("</html>");
		
	}
}
