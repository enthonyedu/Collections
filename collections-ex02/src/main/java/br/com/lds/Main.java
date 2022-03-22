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

		exbirValorDoMapaPelaChave("SRS");
		exbirValorDoMapaPelaChave("MG");

		mapa.put("SRS", "Santa Rita");

		iterarMapa();
	}

	private void adicionarItensNoMapa() {

		try {

			mapa.put("SRS", "Santa Rita do Sapucaí");
			mapa.put("PA", "Pouso Alegre");
			mapa.put("ITA", "Itajuba");
			mapa.put("ZORO", "Conceicao dos ouros");
			mapa.put("CAXU", "Cachoeira de Minas");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	private void iterarMapa() {
		for (String chave : mapa.keySet()) {
			String valor = mapa.get(chave);
			System.out.println("Chave: " + chave + "| Valor: " + valor);

		}
	}

	private void exbirValorDoMapaPelaChave(String chave) {
		try {

			if (mapa.containsKey(chave)) {
				System.out.println("Valor: " + chave);

			} else {
				System.out.println("Chave " + chave + " não existe.");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Ocorreu um erro");
		} finally {
			System.out.println("-------------");
		}

	}

}
