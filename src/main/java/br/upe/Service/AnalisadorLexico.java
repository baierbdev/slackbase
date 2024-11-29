package br.upe.Service;

public class AnalisadorLexico {
	/* Classe resposável pela analise lexica das rotinas
	 * recebidas apartir da entrada
	 */

	public static void analisadorDeRotinas(String[] rotina){
		for(String s : rotina){
			System.out.println(s);
		}

		// primeiroComando(rotina[0]);
		// segundoComando(rotina[1]);


	}
	public static void primeiroComando(String cmd) throws Exception {
		String[] acoes = {"create", "delete", "update", "read", "describe", "help", "info"};
		boolean encontrado = false;
		for(String acao : acoes){
			if(acao.equals(cmd)){
				encontrado = true;
				break;
			}
		}

		if(!encontrado){
			System.out.println("Comando inválido");
		}


	}

	public static void segundoComando(String database){
		/* Analisa a o segundo parâmetro passado se está
		 * de acordo com o funcionamento normal da aplicação
		 */

		if(database.equals("database")){

		}


	}
}
