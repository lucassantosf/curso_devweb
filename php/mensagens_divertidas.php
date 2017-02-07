<!DOCTYPE HTML>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="estilo.css">
		<title>Mensagens divertidas</title>
	</head>

	<body>

		<?php 
			// int
			$valor_inteiro = 1 * 4;
			echo $valor_inteiro;

			echo '<br />';
			$valor_inteiro = $valor_inteiro * 2;
			echo $valor_inteiro;

			// float
			echo '<br />';
			$valor_fracionado = 10.7;
			echo $valor_fracionado;
			
			// boolean
			echo '<br />';
			$estado = true; // false
			echo $estado;
			
			// strings
			echo '<br />';
			$texto = "Curso PHP - $valor_inteiro ";
			echo $texto;
			
		?>
		
				
	</body>
</html>