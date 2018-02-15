<?php  

	require_once('db.class.php');
	$objDb = new db();
	$link = $objDb->conecta_mysql();

	$id_contato = $_POST['id_contato'];

	if(!$id_contato){
		echo 'Informar ID';
		header("refresh: 2; FormDeletar.php");	
		die();
	}

	$sql = "DELETE FROM contatos where id_contato = '$id_contato' ";

	if($resultado = mysqli_query($link,$sql)){
		echo 'Deletado com sucesso';
		header("refresh: 2; FormDeletar.php");
	}else{
		echo 'Falha ao deletar no Banco de Dados';
	}
	

?>