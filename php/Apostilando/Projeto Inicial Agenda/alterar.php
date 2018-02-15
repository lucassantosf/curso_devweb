<?php
	require_once('db.class.php');

	$objDb = new db();
    $link = $objDb->conecta_mysql();

	$nome = $_POST['nome'];
	$telefone = $_POST['telefone'];
	$id_contato =$_POST['id_contato'];

	if($nome){		
		$sql = "UPDATE contatos set nome = '$nome' WHERE id_contato = $id_contato ";
	}

	if($telefone){
		$sql = "UPDATE contatos set telefone = '$telefone' WHERE id_contato = $id_contato ";
	}
	
	$resultado = mysqli_query($link,$sql);

	if($resultado){
		echo 'Dados alterados com sucesso';
		header("refresh: 2; FormAlterar.php");
	}else{
		echo 'Erro ao alterar dados no banco de dados';
	}





?>