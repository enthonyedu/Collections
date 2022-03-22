package br.com.lds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private Scanner scanner = new Scanner(System.in);

	private void start() {

	}

	private String obterDados() {
		try {
			System.out.println("Digite o valor: ");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Dados Invalidos");
			return "INVALIDO";
		}

	}

}
