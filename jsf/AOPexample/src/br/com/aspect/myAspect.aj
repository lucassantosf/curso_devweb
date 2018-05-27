package br.com.aspect;



public aspect myAspect {

	pointcut function():
		call(void br.com.aspect.AOPdemo.*(*));
	after(): function(){
		System.out.println("Aspect after.....");
	}	
	before(): function(){
		System.out.println("....aspect before");
	}
	
}
