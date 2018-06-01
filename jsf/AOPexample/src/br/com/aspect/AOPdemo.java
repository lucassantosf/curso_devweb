package br.com.aspect;

import java.util.Scanner;

public class AOPdemo {

	public static Integer numero = 0;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		AOPdemo aop = new AOPdemo();
		System.out.println("Digite um n�mero para intera��o");
		while (true) {
			System.out.printf("Entre com um n�mero inteiro qualquer: ");
			String linha = entrada.nextLine();
			try {
				int inteiro = Integer.parseInt(linha);
				aop.fazerRepeticao(inteiro);
				break;
			} catch (Exception e) {
				System.out.printf("Voc� n�o digitou um n�mero inteiro!\n");
			}
		}
	}

	public void fazerRepeticao(int num) {
		for (int x = 1; x < num; x++) {
			somarTotal(x);
			System.out.print("Valor somado: ");
			System.out.println(x);
		}
	}

	public void somarTotal(int x) {
		AOPdemo.numero += x;
	}

}
