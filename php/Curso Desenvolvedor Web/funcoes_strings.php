<?php

		//strtolower
	$texto = "Curso Completo PHP ";
	echo strtolower($texto);
	echo '<br/>';
	echo strtoupper($texto);
	echo '<br/>';
	echo ucfirst($texto);
	echo '<br/>';
	echo strlen($texto);
	echo '<br/>';
	
	$texto1 = "12.45";
	echo str_replace(".", ",", $texto1);
	echo '<br/>';

	echo str_replace(".", ",", $texto1);
	echo '<br/>';
	
	$noticia = substr($texto, 0, 5);
	echo $noticia."...";

	echo '<br/>';
	echo '<br/>';
	echo '<br/>';
	echo '<br/>';

	$cpf = isset($_POST['cpf']) ? $_POST['cpf'] : '';
	$total_cpf = strlen($cpf);
	if($total_cpf == 14){
		echo '<br/>';
		$t =  str_replace(".", "", $cpf);
		echo str_replace("-","", $t);
		echo '<br/>';	
	}else if( $total_cpf != 11 && $cpf != '' ){
		echo '<br/>';
		echo "CPF inválido";		
	}
?>

<form method="post" action="">
	<label>CPF:
		<input type="text" name="cpf">
	</label>
	<input type="submit" value="cadastrar">
</form>
