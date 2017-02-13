<?php

function validar_login($login, $senha){

	$login_bd = 'lucas.fer';
	$senha_bd = '123';

	if($login == $login_bd && $senha == $senha_bd){
		return true;
	}
	return false;
}

?>