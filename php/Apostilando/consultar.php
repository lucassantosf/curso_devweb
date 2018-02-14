<?php
	require_once('db.class.php');

	$objDb = new db();
    $link = $objDb->conecta_mysql();

	$nome = $_POST['nome'];
	$telefone = $_POST['telefone'];

	$sql = "Select * from contatos where nome like '%$nome%' " ;// or telefone like '%$telefone%' ";

	$resultado = mysqli_query($link,$sql);

	if($resultado){
		
		while($registro = mysqli_fetch_array($resultado, MYSQLI_ASSOC)){
			$nome = $registro['nome'];			
			echo $nome.'<br/>';
		}

	}else{
		echo "Erro ao executar consulta no Banco de Dados";
	}
	
?>

