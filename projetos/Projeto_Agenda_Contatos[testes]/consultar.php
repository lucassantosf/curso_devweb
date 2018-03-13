<?php
	require_once('db.class.php');

	$objDb = new db();
    $link = $objDb->conecta_mysql();

	$nome = $_POST['nome'];
	$telefone = $_POST['telefone'];

	if($nome){
		$sql = "Select * from contatos where nome like '%$nome%' " ;
	}
	if($telefone){
		$sql = "Select * from contatos where telefone like '%$telefone%' " ;
	}	

	$resultado = mysqli_query($link,$sql);

	if($resultado){
		
		while($registro = mysqli_fetch_array($resultado, MYSQLI_ASSOC)){		
			echo $registro['nome'].' - '.$registro['telefone'].'<br/>';
		}
		header("refresh: 3; FormConsultar.php");

	}else{
		echo "Erro ao executar consulta no Banco de Dados";
	}
	
?>

