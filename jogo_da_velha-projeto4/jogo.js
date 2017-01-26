var rodada = 1;
var matriz_jogo = Array(3);

$(document).ready( function(){

	$('#btn_iniciar_jogo').click( function(){
		
		//validar a digitação dos nomes dos players
		if($('#entrada_apelido_player1').val() == ''){
			alert('Nome 1 ausente');
			return false;
		}
		if($('#entrada_apelido_player2').val() == ''){
			alert('Nome 2 ausente');
			return false;
		}

		// exibir os apelidos nos campos
		$('#nome_jogador1').html( $('#entrada_apelido_player1').val() );
		$('#nome_jogador2').html( $('#entrada_apelido_player2').val() );

		// controlar a visualização das divs
		$('#pagina_inicial').hide();
		$('#palco_jogo').show();
	
	});

	$('.jogada').click( function(){

		var id_campo_clicado = this.id;
		jogada(id_campo_clicado);

	});

	function jogada(id){
		
		var icone = '';
		var ponto = 0;

		if((rodada%2) == 1){
			icone = 'url("imagens/marcacao_1.png")';
			ponto = -1;
		}else{
			icone = 'url("imagens/marcacao_2.png")';
			ponto = 1;
		}
		rodada++;

		$('#'+id).css('background-image',icone);
	}

});