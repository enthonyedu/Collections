package br.com.lds.models;

public abstract class Animal {

	public void som() {
		System.out.println("Este eh o som padrao de um animal: zzzzzzzzz ");
	}

	public void dizerMeuNome() {
		System.out.println("Meu nome eh: " + getNome());

	}

	public void dizerMinhaIdade() {
		System.out.println("Minha idade eh: " + getIdade());
	}

	private String cor = "preto";
	private int idade = 5;
	private String nome = "não definido";

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}