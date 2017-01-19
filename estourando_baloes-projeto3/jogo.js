var timerId = null // variavel responsavel por armazena a chamada da função timeout

function iniciaJogo(){
	var url = window.location.search;
	var nivel_jogo = url.replace("?",""); // forma de recuperar apenas o nivel do jogo
	var tempo_segundos = 0;

	if(nivel_jogo == 1){	// 1 facil - 120 seg
		tempo_segundos = 120;
	}else if(nivel_jogo == 2){	// 2 normal - 60 seg
		tempo_segundos = 60;
	}else if(nivel_jogo == 3){	// dificil - 30 seg
		tempo_segundos = 30;
	}

	//inserir o tempo no span
	document.getElementById("cronometro").innerHTML = tempo_segundos;

	//quantidade de balões
	var qtde_baloes = 80;

	criar_baloes(qtde_baloes);

	//imprimir qtde baloes inteiro
	document.getElementById('baloes_inteiros').innerHTML = qtde_baloes;

	//imprimir qtde baloes estourados
	document.getElementById('baloes_estourados').innerHTML = 0;

	contagem_tempo(tempo_segundos + 1);

}


function criar_baloes(qtde_baloes){

	for(var i = 1 ; i <= qtde_baloes; i++ ){

		var balao = document.createElement("img");
		balao.src = 'imagens/balao_azul_pequeno.png';
		balao.style.margin = '10px';
		balao.id = 'b'+i;
		document.getElementById('cenario').appendChild(balao);
		balao.onmouseout = function() { estourar(this); };
	}
}

function contagem_tempo(segundos){

	segundos--;

	if (segundos == -1) {
		clearTimeout(timerId); // esta função para a execução de setTimeout
		game_over();
		return false;
	}

	document.getElementById("cronometro").innerHTML = segundos;

	timerId = setTimeout("contagem_tempo("+segundos+")", 1000);

}

function game_over(){
	alert('Fim do Jogo');
}

function estourar(e){
	var id_balao = e.id;
	document.getElementById(id_balao).setAttribute("onmouseout", "");
	document.getElementById(id_balao).src = 'imagens/balao_azul_pequeno_estourado.png';
	pontuacao(-1);


}

function pontuacao(acao){
	
	var baloes_inteiros = document.getElementById('baloes_inteiros').innerHTML;
	var baloes_estourados = document.getElementById('baloes_estourados').innerHTML;

	baloes_inteiros = parseInt(baloes_inteiros) + acao;
	baloes_estourados = parseInt(baloes_estourados) - acao;

	document.getElementById("baloes_inteiros").innerHTML = baloes_inteiros;
	document.getElementById("baloes_estourados").innerHTML = baloes_estourados;
	
	situacao_jogo(baloes_inteiros);
}

function situacao_jogo(baloes_inteiros){

	if(baloes_inteiros == 0){
		alert('Parabéns,  você estourou todos os balões a tempo');
		parar_jogo();
	}
}

function parar_jogo(){
	clearTimeout(timerId);
}