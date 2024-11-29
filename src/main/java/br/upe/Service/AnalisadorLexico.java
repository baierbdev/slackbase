package br.upe.Service;

public class AnalisadorLexico {
	/* Classe resposável pela analise lexica das rotinas
	 * recebidas apartir da entrada
	 */

	public static void analisadorDeRotinas(String[] rotina) throws Exception {

		 primeiroComando(rotina[0]);
		 segundoComando(rotina[1]);


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

	public static void segundoComando(String cmd){
		/* Analisa a o segundo parâmetro passado se está
		 * de acordo com o funcionamento normal da aplicação
		 */
		String[] acoes = {"database", "table", "help"};
		boolean encontrado = false;
		for(String acao : acoes){
			if(acao.equals(cmd)){
				System.out.println("Chegou no segundo comando");
				encontrado = true;
				break;
			}

			if(!encontrado){
				System.out.println("Comando inválido no segundo comando");
				break;
			}
		}


	}
}
