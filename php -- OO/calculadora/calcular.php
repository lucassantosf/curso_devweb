<?php

	require_once 'classes/calculadora.php';

	$numero1 = $_POST['n1'];
	$numero2 = $_POST['n2']; 
	$operacao = $_POST['operacao'];
	$calculadora = new Calculadora();

	//Setar valores

	$calculadora->setNum1($numero1);
	$calculadora->setNum2($numero2);

	switch ( $operacao ) {
		case 'somar':
			$calculadora->somar();			
			break;

		case 'subtrair':
			$calculadora->subtrair();			
			break;

		case 'dividir':
			$calculadora->div();			
			break;

		case 'multiplicacao':
			$calculadora->mult();
			break;		
	};

	echo $calculadora->getTotal();

?>