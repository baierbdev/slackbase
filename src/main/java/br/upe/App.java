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
			while( true ) {
				System.out.print("> ");
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
			System.out.println("Digite 'help' para mais informações");
		}


	}
}
