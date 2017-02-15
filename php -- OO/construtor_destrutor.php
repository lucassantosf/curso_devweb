<?php

	class Pessoa{
		
		private $nome;

		public function correr(){
			echo $this->nome . ' correndo<br/>';
		}

		public function __construct($pnome){
			echo 'Contrutor iniciado <br/>';
			$this->nome = $pnome;			
		}

		public function __destruct(){
			echo "Objeto removido<br/>";
		}

	}

	$pessoa = new Pessoa('Lucas');
	$pessoa->correr();

?>