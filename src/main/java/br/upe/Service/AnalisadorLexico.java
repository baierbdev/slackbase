package br.upe.Service;

public class AnalisadorLexico {
	/* Classe resposável pela analise lexica das rotinas
	 * recebidas apartir da entrada
	 */

	public static void analisadorDeRotinas(String[] rotina) throws Exception {

		verificaPrimeiraInstrucao(rotina[0]);
		verificaArgumento(rotina[1]);


	}
	public static void verificaPrimeiraInstrucao(String cmd) {
		/* Método que analisa se o primeiro parâmetro está de acordo
		 * com o fluxo de execução comum.
		 */
		String[] acoes = {"create", "delete", "read", "describe", "help", "info", "show"};
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

	public static void verificaArgumento(String cmd){
		/* Analisa a o segundo parâmetro passado se está
		 * de acordo com o funcionamento normal da aplicação.
		 */
		String[] acoes = {"database", "help"};
		boolean encontrado = false;
		for(String acao : acoes){
			if(acao.equals(cmd)){
				encontrado = true;
				break;
			}

		if(!encontrado){
			System.out.printf("O %s não é válido como argumento\n",cmd);
			System.out.println("Digite o comando + help para ver a lista de argumentos válidos");
				break;
			}
		}


	}
}
