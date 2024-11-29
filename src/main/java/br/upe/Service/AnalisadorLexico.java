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
		try {

			for(String acao : acoes){
				if(!acao.equals(cmd)){
					continue;
				} else{
					throw new Exception();
				}
			}
		} catch (Exception e){
			System.out.println("Comando inválido");
		}


	}

	public static void segundoComando(String database){
		if(database.equals("database")){

		}


	}
}
