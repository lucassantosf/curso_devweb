<?php

	$global = "Sou uma Variável Global";

	function mostrar($arg1,$arg2){
		echo $arg1.$arg2;
	}

	function mostrarVariavelLocal(){
		$varlocal = 'Sou uma variável local';
		echo $varlocal;
	}

	function mostrarVariavelGlobal(){
		global $global; // global define a váriavel com escopo global
		echo $global;
	}

	function VarEstatica(){
		static $a = 0;
		echo $a++."<br>";
	}

	function VarConstante(){
		define ("pi", 3.1415926536);
		echo pi;
	}
	
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="utf-8">
	<title>Estudo PHP</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />

</head>
<body>
	
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<form method="post" action="resultado.php">
					<h2>Formulário Para treino</h2>
					<input type="text" name="idade" placeholder="Qual sua idade ?">
					<button type="submit" >Calcular</button>
					
				</form>
				
				<h2>Variável Local</h2>
				<?= mostrarVariavelLocal() ?>
				<h2>Variável Global</h2>
				<?= mostrarVariavelGlobal() ?>
				<h2>Varíavel Estática </h2>
				<?php for($a=8; $a<= 17; $a++) {VarEstatica();} ?>
				<h2>Variável Constante</h2>
				<p>O valor aproximado de Pi é <?= VarConstante(); ?></p>
				
			</div>
		</div>
	</div>
	

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
</body>
</html>