<?php
	
	$noticias = array();

	$noticias[1]['titulo'] = 'titulo da noticia 1';
	$noticias[1]['conteudo'] = 'conteudo noticia 1';

	$noticias[2]['titulo'] = 'titulo da noticia 2';
	$noticias[2]['conteudo'] = 'conteudo noticia 2';

	$noticias[3]['titulo'] = 'titulo da noticia 3';
	$noticias[3]['conteudo'] = 'conteudo noticia 3';

	$noticias[4]['titulo'] = 'titulo da noticia 4';
	$noticias[4]['conteudo'] = 'conteudo noticia 4';

	$noticias[5]['titulo'] = 'titulo da noticia 5';
	$noticias[5]['conteudo'] = 'conteudo noticia 5';

	$noticias[6]['titulo'] = 'titulo da noticia 6';
	$noticias[6]['conteudo'] = 'conteudo noticia 6';

	$noticias[7]['titulo'] = 'titulo da noticia 7';
	$noticias[7]['conteudo'] = 'conteudo noticia 7';

	$noticias[8]['titulo'] = 'titulo da noticia 8';
	$noticias[8]['conteudo'] = 'conteudo noticia 8';
	//var_dump($noticias);
	$idx = 1;
	
	/*while ( $idx <= count($noticias) ) {
		
		echo $noticias[$idx]['titulo'];
		echo "<br />";
		$idx = $idx + 1;
	}*/

	/*do{
		
		echo $noticias[$idx]['titulo'];
		echo "<br />";

		echo $noticias[$idx]['conteudo'];
		echo "<br />";
		echo "<br />";
		echo "<br />";
		$idx = $idx + 1;

	}while($idx <= count($noticias));
	*/

	for($idx = 1 ;  $idx <= count($noticias) ; $idx++ ){
		echo $noticias[$idx]['titulo'];
		echo "<br />";

		echo $noticias[$idx]['conteudo'];
		echo "<br />";
		echo "<br />";
		echo "<br />";
	}

?>