package br.upe.Service;

import java.io.IOException;

import br.upe.SO.AcessoEmMemoria;
import org.w3c.dom.ls.LSOutput;

public class AnalisadorLexico {
	/* Classe resposável pela analise lexica das rotinas
	 * recebidas apartir da entrada
	 */
	AcessoEmMemoria acessoEmMemoria = new AcessoEmMemoria();
	StringManipulador stringManipulador= new StringManipulador();

	public void analisadorDeRotinas(String[] rotina) throws IOException {
		String[] parametro = null;
		if(rotina.length > 3){
			parametro = stringManipulador.quebrarParametro3(rotina[3].toLowerCase());
		}


        switch (rotina[0]) {
            case "create" -> funcaoCreate(rotina[2], parametro);
            case "update" -> funcaoUpdate(rotina[2], parametro);
            case "delete" -> funcaoDelete(rotina[2]);
            case "read" -> funcaoRead(rotina[2]);
            case "describe" -> funcaoDescribe(rotina[2]);
            case "help" -> funcaoHelp(rotina[1]);
            case "info" -> funcaoInfo();
            default -> {
                verificaPrimeiraInstrucao(rotina[0].toLowerCase());
                verificaArgumento(rotina[1].toLowerCase());
            }
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
	public void funcaoDelete(String nomeDoDatabase){
		acessoEmMemoria.deletaDatabase(nomeDoDatabase);
	}
	public void funcaoUpdate(String nomeDoDatabase, String[] dadosParaGravar){
		acessoEmMemoria.databaseAcesso(dadosParaGravar,nomeDoDatabase);
	}
	public void funcaoRead(String nomeDoDatabase){

		acessoEmMemoria.imprimeGravacoes(nomeDoDatabase);
	}
	public void funcaoDescribe(String nomeDoDatabase){

		acessoEmMemoria.imprimeCabecalho(nomeDoDatabase);
	}
	public void funcaoInfo(){
		System.out.println();
	}

	public void funcaoHelp(String comando){
        switch (comando){
            case "create":
                System.out.println("Use o comando 'create' dessa forma:");
                System.out.println("create database <nomeDatabase> (\"nome\", \"sobrenome\")");
                break;
            case "delete":
                System.out.println("Use o comando 'delete' dessa forma:");
                System.out.println("delete database <nomeDatabase>");
                break;
            case "update":
                 System.out.println("Use o comando 'update' dessa forma:");
                 System.out.println("update database <nomeDatabase> (\"nome\", \"sobrenome\")");
                 break;
            case "read":
                System.out.println("Use o comando 'read' dessa forma:");
                System.out.println("read database <nomeDatabase>");
                break;
            case "describe":
                System.out.println("Use o comando 'describe' dessa forma:");
                System.out.println("describe database <nomeDatabase>");
				break;
			default:
				System.out.println("Sem entrada!");
				break;
        }
	}
}
