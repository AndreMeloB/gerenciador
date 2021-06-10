package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.Writer;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Writer out = resp.getWriter();
		out.write("<html>");
		out.write("<body>");
		out.write("Olá mundo, esta Servlet está funcionando.");
		out.write("</body>");
		out.write("</html>");
	}

}
