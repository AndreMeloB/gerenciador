package br.com.alura.gerenciador.acao;

import java.io.IOException;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MostraEmpresa implements Acao {
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idParam = req.getParameter("id");
		Integer id = Integer.valueOf(idParam);
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresa(id);

		req.setAttribute("empresa", empresa);
		return "forward:formMostraEmpresa.jsp";
	}
}
