<?php

	//date = Y=> 2020, y=>20 - m - d
	$data =  date("d/m/Y h:i");
	echo $data;
	echo '<br/>';
	echo '<br/>';
	echo '<br/>';
	//strtotime
	$data_inicial = '2015-04-02';
	$data_final = '2016-04-03';

	$time_inicial = strtotime($data_inicial);
	$time_final = strtotime($data_final);

	$dif = $time_final - $time_inicial;
	$diaSegundos = 24*60*60;
	$dif_dias = $dif / $diaSegundos;
	echo $dif_dias;

?>