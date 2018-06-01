package br.com.aspect;

import java.util.*;

public aspect myAspect {
	AOPdemo aop2 = new AOPdemo();

	pointcut function():
		call(void br.com.aspect.AOPdemo.somarTotal(*));

	after(): function(){
		System.out.print("Valor da soma total atual: ");
		System.out.println(AOPdemo.numero);
	}

	before(): function(){
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("Valor inicial: ");
		System.out.println(AOPdemo.numero);
	}
}
