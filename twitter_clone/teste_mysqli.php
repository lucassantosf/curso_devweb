<?php

	require_once('db.class.php');

	$sql = "select * from usuarios ";

	$objDb = new db();
	$link = $objDb->conecta_mysql();

	//select retorna false se houver erro, resource dados da consulta
	$resultado_id = mysqli_query($link,$sql);

	if($resultado_id){
		$dados_usuario = array();

		while($linha = mysqli_fetch_array($resultado_id, MYSQLI_ASSOC)){
			$dados_usuario[] = $linha;
		}

		foreach ($dados_usuario as $usuario) {
			echo $usuario['email'];
			echo "<br />";
		}
		
	}else{
		echo "Erro na execução da consulta, favor entrar em contato com o suporte.";
	}
?>