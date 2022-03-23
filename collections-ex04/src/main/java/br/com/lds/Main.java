package br.com.lds;

import java.util.ArrayList;
import java.util.List;

import br.com.lds.models.Animal;
import br.com.lds.models.Cachorro;
import br.com.lds.models.Gato;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private void start() {

		List<Animal> animais = new ArrayList<Animal>();

		Cachorro primeiroCachorro = new Cachorro("Tiburssinho");
		Cachorro segundoCachorro = new Cachorro("Aroldo");

		primeiroCachorro.setCor("azul");

		animais.add(primeiroCachorro);
		animais.add(segundoCachorro);

		Gato primeiroGato = new Gato();
		Gato segundoGato = new Gato("Verde");

		animais.add(primeiroGato);
		animais.add(segundoGato);

		for (Animal animal : animais) {

			if (animal instanceof Cachorro) {

				Cachorro cachorro = (Cachorro) animal;
				cachorro.som();
				cachorro.dizerMeuNome();
				cachorro.dizerMinhaIdade();
				cachorro.oQueGostoDeFazer();

				System.out.println("Cor do cachorro: " + cachorro.getCor());
				System.out.println("----");

			} else if (animal instanceof Gato) {

				Gato gato = (Gato) animal;
				gato.som();
				gato.dizerMeuNome();
				gato.dizerMinhaIdade();
				gato.oQueEuFacoDuranteANoite();

				System.out.println("Cor do gato: " + gato.getCor());
				System.out.println("-----");

			} else {
				System.out.println("Tipo não encontrado");
			}

		}

	}
}