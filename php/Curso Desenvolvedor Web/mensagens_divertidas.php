<!DOCTYPE HTML>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="estilo.css">
		<title>Mensagens divertidas</title>
	</head>

	<body>

		<?php 
			
		

			// array unidimencional
			
			
			$mensagem['a'] = "Tente ser bem melhor que você mesmo";
			$mensagem['b'] = "Mesmo quando quero falar sobre mim, não acho as palavras certas que me classifiquem";
			$mensagem['c'] = "Sou um pouco de tudo o que há, do que eu gostaria de ser, sou uma outra pessoa";
			$mensagem[4] = "Alguem que não se existe, mas que parece com um monte de gente, que como eu, não se encaixa em nada.";
			$mensagem[5] = "Muito mais fácil! Pessoas queridas, momentos vividos, tudo é saudade…";
			

			// outra forma de declaração
			$teste = 'TESTE';
			$mensagem = array('a' => "Muito mais fácil! Pessoas queridas, momentos vividos, tudo é saudade…" ,
			'b' => "Mesmo quando quero falar sobre mim, não acho as palavras certas que me classifiquem",
			'c' => true,
			'd' => 10.7,
			'e' => $teste);

			var_dump($mensagem);
			echo '<br/>';
			print_r($mensagem);
			echo '<br/>';
			echo $mensagem['b'];
		

			//array multidimensional



		?>

		
				
	</body>
</html>