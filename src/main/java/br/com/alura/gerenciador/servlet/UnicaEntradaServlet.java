package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import br.com.alura.gerenciador.acao.Acao;
import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresaForm;
import br.com.alura.gerenciador.acao.RemoveEmpresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String paramAcao = req.getParameter("acao");
		System.out.println(paramAcao);
		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
		
		String nome;
		try {
			Class classe = Class.forName(nomeDaClasse);
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(req, resp);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}

		String[] tipoEEndereco = nome.split(":");
		if (tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/" + tipoEEndereco[1]);
			rd.forward(req, resp);
		} else if (tipoEEndereco[0].equals("redirect")) {
			resp.sendRedirect(tipoEEndereco[1]);
		}

		/*
		 * String nome = null; if (paramAcao.equals("ListaEmpresas")) { ListaEmpresas
		 * acao = new ListaEmpresas(); nome = acao.executa(req, resp); } else if
		 * (paramAcao.equals("RemoveEmpresa")) { RemoveEmpresa acao = new
		 * RemoveEmpresa(); nome = acao.executa(req, resp); } else if
		 * (paramAcao.equals("MostraEmpresa")) { MostraEmpresa acao = new
		 * MostraEmpresa(); nome = acao.executa(req, resp); } else if
		 * (paramAcao.equals("AlteraEmpresa")) { AlteraEmpresa acao = new
		 * AlteraEmpresa(); nome = acao.executa(req, resp); } else if
		 * (paramAcao.equals("NovaEmpresa")) { NovaEmpresa acao = new NovaEmpresa();
		 * nome = acao.executa(req, resp); } else if
		 * (paramAcao.equals("NovaEmpresaForm")) { NovaEmpresaForm acao = new
		 * NovaEmpresaForm(); nome = acao.executa(req, resp); }
		 */

	}
}
