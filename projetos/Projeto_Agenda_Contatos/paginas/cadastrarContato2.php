<?php

	require_once('../db.class.php');
	$objetoDB = new db();
	$link = $objetoDB->conecta_mysql();

	$descricao = $_POST['descricao'];
	$telefone = $_POST['telefone'];
	
	$sql = "INSERT INTO tb_contatos (descricao, telefone) values ('$descricao','$telefone') ; ";

	$resultado = mysqli_query($link, $sql);

	if($resultado){
		echo 'Sucesso ao cadastrar contato em Banco de Dados';
		header("refresh: 1; cadastrarContato.php");
	}else{
		echo 'Erro ao cadastrar contato em Banco de Dados';
	}



?>