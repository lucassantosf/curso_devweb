<?php

class Calculadora{

	private $total;
	private $n1;
	private $n2;

	function __construct(){
		$this->total = 0;
		$this->n1 = 0;
		$this->n2 = 0;
	}

	//getters e setters
	public function setNum1($num1){
		$this->n1 = $num1;		
	}

	public function setNum2($num2){
		$this->n2 = $num2;		
	}

	public function getTotal(){
		return $this->total;
	}		

	//operacoes

	public function somar(){
		$this->total = $this->n1 + $this->n2;
	}

	public function subtrair(){
		$this->total = $this->n1 - $this->n2;
	}

	public function mult(){
		$this->total = $this->n1 * $this->n2;
	}

	public function div(){
		$this->total = $this->n1 / $this->n2;
	}
}

?>