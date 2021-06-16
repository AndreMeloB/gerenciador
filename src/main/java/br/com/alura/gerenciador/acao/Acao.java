package br.com.alura.gerenciador.acao;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Acao {
	String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
