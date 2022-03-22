package br.com.lds;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private Map<String, String> mapa = new HashMap<String, String>();

	private void start() {
		adicionarItensNoMapa();
		iterarMapa();

	}

	private void adicionarItensNoMapa() {
		mapa.put("SRS", "Santa Rita do Sapucaí");
		mapa.put("PA", "Pouso Alegre");
		mapa.put("ITA", "Itajuba");
		mapa.put("ZORO", "Conceicao dos ouros");
		mapa.put("CAXU", "Cachoeira de Minas");
	}

	private void iterarMapa() {
		for (String chave : mapa.keySet()) {
			String valor = mapa.get(chave);
			System.out.println("Chave: " + chave + "| Valor: " + valor);

		}
	}

}
