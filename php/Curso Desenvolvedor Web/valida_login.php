<?php

require_once("funcoes_validar_login.php");

$login_usuario = $_POST['login'];

$senha_usuario = $_POST['senha'];

$usuario_validado = validar_login($login_usuario, $senha_usuario);

if( $usuario_validado )
	echo "Acesso liberado";
else
	echo "Acesso negado";

?>