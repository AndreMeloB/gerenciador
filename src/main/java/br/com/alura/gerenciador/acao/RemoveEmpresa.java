package br.com.alura.gerenciador.acao;

import java.io.IOException;

import br.com.alura.gerenciador.modelo.Banco;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RemoveEmpresa {
	public void executa(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String idParam = req.getParameter("id");
		Integer id = Integer.valueOf(idParam);
		Banco banco = new Banco();
		banco.removeEmpresa(id);

		resp.sendRedirect("entrada?acao=ListaEmpresas");
	}
}
