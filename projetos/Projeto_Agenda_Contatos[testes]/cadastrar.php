<?php
	require_once('db.class.php');
	
	$nome = $_POST['nome'];
	$telefone = $_POST['telefone'];
	$turno = $_POST['turno'];
	$ativo = $_POST['ativo'];
		
	$objDb = new db();
    $link = $objDb->conecta_mysql();

	$sql = "INSERT into contatos(nome, telefone, turno, ativo) values ('$nome', $telefone, '$turno', '$ativo')";

	$resultado_id = mysqli_query($link, $sql);

	if($resultado_id){
		echo 'Sucesso ao cadastrar Contato';
		header("refresh: 2; FormCadastrar.php");

	}else{
		echo 'Erro ao executar query';
	}	

	//header("refresh : 3; FormCadastrar.php");
?>