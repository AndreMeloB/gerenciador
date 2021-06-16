package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer idEmpresa = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(Banco.idEmpresa++);
		empresa.setNome("Alura");
		empresa.setDataAbertura(new Date());
		Empresa empresa2 = new Empresa();
		empresa2.setId(Banco.idEmpresa++);
		empresa2.setNome("Caelum");
		empresa2.setDataAbertura(new Date());
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.idEmpresa++);
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		while (it.hasNext()) {
			if (it.next().getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresa(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
}