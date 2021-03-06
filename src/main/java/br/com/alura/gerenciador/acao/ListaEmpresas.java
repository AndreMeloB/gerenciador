package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ListaEmpresas implements Acao {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		req.setAttribute("empresas", lista);
		return "forward:listaEmpresas.jsp";
	}
}
