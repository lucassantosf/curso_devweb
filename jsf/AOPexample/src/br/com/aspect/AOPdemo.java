package br.com.aspect;

public class AOPdemo {

	public static void main(String[] args) {
		AOPdemo aop = new AOPdemo();
		aop.methodOne(5);
		aop.methodOne(10, "Hello Word");
		aop.methodTwo("Tiau");
	}

	public void methodOne(int var) {
		System.out.println("Metodo um inteiro");
	}

	public void methodOne(int var, String str) {
		System.out.println("Metodo um inteiro e texto");
	}

	public void methodTwo(String str) {
		System.out.println("Metodo Dois String");
	}

}
