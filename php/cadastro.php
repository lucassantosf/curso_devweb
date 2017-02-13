<?php

if( isset($_POST['nome']) && empty($_POST['nome']) ) {
	echo 'Preencha nome completo<br/>';
}

if( isset($_POST['cpf']) && empty($_POST['cpf']) ) {
	echo 'Preencha o cpf<br/>';
}

if( isset($_POST['cpf']) && !is_numeric($_POST['cpf']) ) {
	echo 'Apenas Numero como CPF<br/>';
}

?>

<form method="post" action="">
	<label>
		Nome completo*:
		<input type="text" name="nome" >
	</label>

	<label>
		CPF*:
		<input type="text" name="cpf" >
	</label>

	<input type="submit" value="Cadastrar" >
	</label>


</form>