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
			parametro = stringManipulador.quebrarParametro3(rotina[3]);
		}


        switch (rotina[0]) {
            case "create" -> funcaoCreate(rotina[2], parametro);
            case "update" -> funcaoUpdate(rotina[2], parametro);
            case "delete" -> funcaoDelete(rotina[2]);
            case "read" -> funcaoRead(rotina[2]);
            case "describe" -> funcaoDescribe(rotina[2]);
            case "help" -> funcaoHelp(rotina[1]);
            case "info" -> funcaoInfo();
			case "ajuda" -> funcaoAjuda();
			case "manual" -> funcaoManual();
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
		System.out.println("****** Informações sobre o sistema de gerenciamento de banco de dados ******\n\n" +
				"Versão 1.0\n" +
				"O projeto teve como estrutura significativa o conceito de arrays e listas. Nesse sentido,\n" +
				"foi idealizado um projeto de banco de dados, onde fosse possível realizar as operações mais\n" +
				"básicas de salvamento, criação, edição e remoção de conteúdo.\n\n" +
				"Tal forma se deu a partir da utilização de arquivos CSV, os mesmos" +
				"utilizados por padrão no Microsoft Excel. A estrutura de um arquivo\n" +
				"CSV segue um padrão bastante simples, onde os dados estão dispostos em texto puro, separados por vírgulas.\n\n" +
				"Dessa forma, a aplicação trabalha diretamente com a manipulação desses" +
				" dados, realizando inserções em um arquivo com um cabeçalho estabelecido\n" +
				"para emular o funcionamento de um banco de dados.\n" +
				"Digite ajuda para vê os comandos básicos.");
	}
	public void funcaoAjuda(){
		System.out.println("\n\n******** Comandos disponíveis ********\n\n" +
				"Cria um novo database\n" +
				"create database <nome do database> (nome, sobrenome, idade)\n\n" +
				"Insere um novo dado no database\n" +
				"update database <nome do database> (“Pedro”, “Guilherme”, “20”)\n\n" +
				"Deleta o database\n" +
				"delete database <nome do database>\n\n" +
				"Mostra as informações do banco\n" +
				"read database <nome do database>\n\n" +
				"Descreve as propriedades do banco\n" +
				"describe database <nome do database>\n\n" +
				"Mostra individualmente como usar um comando específico\n" +
				"help <comando>\n\n" +
				"Mostra todos os comandos disponíveis\n" +
				"ajuda\n\n" +
				"Informações sobre o sistema\n" +
				"info\n");
	}
	public void funcaoManual(){
		System.out.println("Consulte online em: https://github.com/baierbdev/slackbase/wiki");
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
