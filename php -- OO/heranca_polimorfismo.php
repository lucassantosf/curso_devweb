<?php

// Classe mãe - SuperClasse
class Felino {
	
	var $mamifero = 'sim';

	function correr(){
		echo 'Correr como felino';
	} 

}

// Classe filha - subclasse
class Chita extends Felino {

	// Polimorfismo - sobescreve o método correr da classe mãe
	function correr(){
		echo "Correr como chita";
	}
}

class Gato extends Felino {

}

$chita = new Chita();

echo $chita->mamifero . '<br/>';
$chita->correr();

?>
