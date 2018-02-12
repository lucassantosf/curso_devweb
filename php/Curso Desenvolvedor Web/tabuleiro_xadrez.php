<!DOCTYPE HTML>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="estilo.css">
		<title>Tabuleiro Xadrez</title>
	</head>

	<body>

		<?php 
			
			//array multidimensional

			$tabuleiro[8]['a'] = 'torre preta';
			$tabuleiro[8]['b'] = 'bispo preta';
			$tabuleiro[8]['c'] = 'cavalo preta';
			$tabuleiro[8]['d'] = 'rainha preta';
			$tabuleiro[8]['e'] = 'rei preta';
			$tabuleiro[8]['f'] = 'bispo preta';
			$tabuleiro[8]['g'] = 'cavalo preta';
			$tabuleiro[8]['h'] = 'torre preta';

			$tabuleiro[7]['a'] = 'peão preto';
			$tabuleiro[7]['b'] = 'peão preto';
			$tabuleiro[7]['c'] = 'peão preto';
			$tabuleiro[7]['d'] = 'peão preto';
			$tabuleiro[7]['e'] = 'peão preto';
			$tabuleiro[7]['f'] = 'peão preto';
			$tabuleiro[7]['g'] = 'peão preto';
			$tabuleiro[7]['h'] = 'peão preto';

			$tabuleiro[1]['a'] = 'torre branco';
			$tabuleiro[1]['b'] = 'bispo branco';
			$tabuleiro[1]['c'] = 'cavalo branco';
			$tabuleiro[1]['d'] = 'rainha branco';
			$tabuleiro[1]['e'] = 'rei branco';
			$tabuleiro[1]['f'] = 'bispo branco';
			$tabuleiro[1]['g'] = 'cavalo branco';
			$tabuleiro[1]['h'] = 'torre branco';

			$tabuleiro[2]['a'] = 'peão branco';
			$tabuleiro[2]['b'] = 'peão branco';
			$tabuleiro[2]['c'] = 'peão branco';
			$tabuleiro[2]['d'] = 'peão branco';
			$tabuleiro[2]['e'] = 'peão branco';
			$tabuleiro[2]['f'] = 'peão branco';
			$tabuleiro[2]['g'] = 'peão branco';
			$tabuleiro[2]['h'] = 'peão branco';

			print_r($tabuleiro);
			echo '<br />';
			print $tabuleiro[8]['d'];

			echo '<br />';
			print $tabuleiro[2]['g'];


		?>

		
				
	</body>
</html>