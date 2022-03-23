package br.com.lds.models;

public class Cachorro extends Animal {

	public Cachorro(String nome) {
		setNome(nome);

	}

	@Override
	public void som() {
//		super.som();
		System.out.println("eu gosto de latir");
	}

	public Cachorro() {
		// TODO Auto-generated constructor stub
	}

	public void oQueGostoDeFazer() {
		System.out.println("Gosto de morder os carteiros.");
	}

}