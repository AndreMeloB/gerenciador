package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AlteraEmpresa {
	public void executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeEmpresa = req.getParameter("nome");
		String paramDataEmpresa = req.getParameter("data");
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date dataAbertura = null;

		try {
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresa(id);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);

		resp.sendRedirect("entrada?acao=ListaEmpresas");
	}
}
