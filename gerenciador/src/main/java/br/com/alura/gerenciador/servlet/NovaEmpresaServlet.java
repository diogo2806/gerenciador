package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		
		String nomeEmpresa = 
		
		PrintWriter out = resp.getWriter();
		out.println("<html><head><meta charset='UTF-8'></head><body>Olá Mundo 3.0!</body></html>");
		
	}
}
