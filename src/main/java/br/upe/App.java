package br.upe;
import br.upe.IO.EntradaESaida;
import br.upe.SO.SistemaOperacional;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		SistemaOperacional sistemaOperacional = new SistemaOperacional();
		EntradaESaida entradaESaida = new EntradaESaida();
		sistemaOperacional.setaSistemaConfig();
		try{
			Scanner scanner = new Scanner(System.in);
			String system = System.getProperty("os.name"); // Obtém o sistema operacional
			String version = "1.0.0";
			String authors = "Lucas Terêncio, Pedro Guilherme, Bruno Baier";

			System.out.println("SlackBase DB  Ver " + version + " (" + system + ")\n");
			System.out.println("Copyright (c) 2024, " + authors + ". All rights reserved.\n");
			System.out.println("SlackBase é um sistema de gerenciamento de banco de dados feito utilizando arquivos CSV.\n");
			System.out.println("Digite \"help\" para conseguir ajuda ou manual para consultar o manual online.\n");
			while( true ) {
				System.out.print("SlackBase> ");
				String entrada = scanner.nextLine();
				if (entrada.equals("exit")) {
					System.out.println("Bye!! ");
					scanner.close();
					break;
				}

				entradaESaida.receberEntrada(entrada);

			}
		} catch (NoSuchElementException e){
			System.out.println("Não há nenhuma entrada");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Não há nenhuma entrada ou não corresponde ao fluxo primário");
			System.out.println("Digite 'help <nome do comando>' para mais informações");
		}


	}
}
