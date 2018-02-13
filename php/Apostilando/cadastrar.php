<?php
	require_once('db.class.php');
	
	$nome = $_POST['nome'];
	$telefone = $_POST['telefone'];
	$turno = $_POST['turno'];
	$ativo = $_POST['ativo'];
		
	$objDb = new db();
    $link = $objDb->conecta_mysql();

	$sql = "INSERT into contatos(nome, telefone, turno, ativo) values ('$nome', $telefone, '$turno', '$ativo')";

	if($resultado_id = mysqli_query($link, $sql)){
		echo 'Sucesso';
	}else{
		echo 'Erro ao executar query';
	}	

?>