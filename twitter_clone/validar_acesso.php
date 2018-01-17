<?php
	require_once('db.class.php');

	$usuario = $_POST['usuario'];
	$senha = $_POST['senha'];

	$sql = "select * from usuarios where usuario = '$usuario' and senha = '$senha' ";

	$objDb = new db();
	$link = $objDb->conecta_mysql();

	//select retorna false se houver erro, resource dados da consulta
	$resultado_id = mysqli_query($link,$sql);

	if($resultado_id){
		
		$dados_usuario = mysqli_fetch_array($resultado_id);
				
		if (isset($dados_usuario['usuario'])) {
			echo 'Usuario existe';
		}else{
			header('Location: index.php?erro=1');
		}
	}else{
		echo "Erro na execução da consulta, favor entrar em contato com o suporte.";
	}

	

	


?>