package br.upe.Service;

import java.io.IOException;

import br.upe.SO.AcessoEmMemoria;

public class AnalisadorLexico {
	/* Classe resposável pela analise lexica das rotinas
	 * recebidas apartir da entrada
	 */
	AcessoEmMemoria acessoEmMemoria;

	public void analisadorDeRotinas(String[] rotina) throws IOException {
        verificaArgumento(rotina[0].toLowerCase());
        verificaArgumento(rotina[1].toLowerCase());
        switch (rotina[0]){
            case "create":
                String[] parametro = StringManipulador.quebrarParametro3(rotina[3].toLowerCase());
                funcaoCreate(rotina[2],parametro);
            case "update":

        }


    }
	public static void verificaPrimeiraInstrucao(String cmd) {
		/* Método que analisa se o primeiro parâmetro está de acordo
		 * com o fluxo de execução comum.
		 */
		String[] acoes = {"create", "update", "delete", "read", "describe", "help", "info"};
		boolean encontrado = false;
		for(String acao : acoes){
			if(acao.equals(cmd)){
				encontrado = true;
				break;
			}
		}

		if(!encontrado){
			System.out.println("Não houve nenhuma entrada!");
		}


	}

	public static void verificaArgumento(String cmd){
		/* Analisa a o segundo parâmetro passado se está
		 * de acordo com o funcionamento normal da aplicação.
		 */
		String[] acoes = {"database", "help"};
		boolean encontrado = false;
		for(String acao : acoes) {
			if (acao.equals(cmd)) {
				encontrado = true;
				break;
			}
		}

		if(!encontrado){
			System.out.printf("O %s não é válido como argumento\n",cmd);
			System.out.println("Digite o comando + help para ver a lista de argumentos válidos");
		}


	}
	public void funcaoCreate(String nomeDoDatabase, String[] rotina){
		acessoEmMemoria.criarDatabase(nomeDoDatabase, rotina);	
	}
	public void funcaoDelete(String nomeDoDatabase){}
	public void funcaoUpdate(String nomeDoDatabase){}
	public void funcaoRead(String nomeDoDatabase){}
	public void funcaoDescribe(String nomeDoDatabase){

	}
	public void funcaoHelp(String nomeDoDatabase){}
	public void funcaoInfo(String nomeDoDatabase){}
}
