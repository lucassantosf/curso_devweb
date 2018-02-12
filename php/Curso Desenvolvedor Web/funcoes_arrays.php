<?php

	//is_array
	$array = array('notebook','Teclado');
	$retorno = is_array($array);

	if ($retorno){
		echo "Verdadeiro";
	}else{
		echo "Falso";
	}

	echo "<br/>";

	//in_array
	$array2 = array('mac','linux','windows');
	$retorno = in_array('mac', $array2);

	if ($retorno){
		echo "Contém";
	}else{
		echo "Não Contém";
	}

	echo "<br/>";

	//array_keys
	$produtos = array(10=> 'Notebook', 11=> 'Teclado');
	$chaves_array = array_keys($produtos);
	var_export($chaves_array);
	echo "<br/>";

	//sort
	$frutas = array(0=>'Banana', 1=>'Amora',2=>'Carambola');
	sort($frutas);
	var_export($frutas);
	echo "<br/>";

	//asort
	$frutas2 = array(0=>'Banana', 1=>'Amora',2=>'Carambola');
	asort($frutas2);
	var_export($frutas2);
	echo "<br/>";

	// count
	$frutas2 = array(0=>'Banana', 1=>'Amora',2=>'Carambola',3=>'Limão');
	$itens_array = count($frutas2);
	echo $itens_array;
	echo "<br/>";

	//array_merge
	$array10 = array('mac','linux');
	$array20 = array('windows');
	$array30 = array('solaris');
	$novo_array = array_merge($array10,$array20,$array30);
	var_export($novo_array);
	echo "<br/>";

	//explode
	$string = "20/10/2030";
	$retorno = explode("/", $string);
	var_export($retorno);
	echo "<br/>";

	//implode
	$nova_string = implode("/", $retorno);
	echo $nova_string;
	echo "<br/>";


?>