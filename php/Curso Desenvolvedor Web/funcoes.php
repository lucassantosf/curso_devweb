<?php 

function without(){
	echo 'Função sem retorno<br/>';
}

function with(){
	return 'Função com retorno';
}

function parameters($nome){
	echo "<br />Nome : ".$nome;
}

without();

echo with();

parameters('Matias');

?>