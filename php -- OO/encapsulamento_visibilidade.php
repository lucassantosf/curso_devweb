<?php

	class Veiculo{

		/*
		public = var
		private
		protected
		*/
		private $placa;
		private $cor;
		protected $tipo = 'Sedan';

		public function setPlaca($paramentro_placa){
			
			//Validacao da placa

			$this->placa = $paramentro_placa;
		}

		public function getPlaca(){
			return $this->placa;
		}

		public function setCor($paramentro_cor){
			$this->cor = $paramentro_cor;
		}
		public function getCor(){
			return $this->cor;
		}

	}

	class Carro extends Veiculo{

		public function exibirTipo(){
			echo $this->tipo;
		}
	
	}

	$veiculo = new Veiculo();

	$veiculo->setPlaca('AAA1234');
	echo $veiculo->getPlaca();

	echo '<br/>';

	$veiculo->setCor('preto');
	echo $veiculo->getCor();

	echo '<br/>';
	echo '<br/>';

	$carro = new Carro();
	$carro->exibirTipo();
/**/
?>