package br.upe.SO;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.*;

public class AcessoEmMemoria {

	public void criarDatabase(String nome ,String[] cabecalho ){
		/* Método utilizado para criar uma nova database */
		String path  = SistemaOperacional.systemReturnPath()+nome+".csv";
		File database = new File(path);
		try (Writer writer = Files.newBufferedWriter(Paths.get(path));
                 CSVWriter csvWriter = new CSVWriter(writer)) {
			if ( database.createNewFile()  ){
			System.out.println("Arquivo criado!");
			}
				csvWriter.writeNext(cabecalho);

		}catch (IOException e){
			System.out.println("Banco de dados, já existe!");
		}
	
	}
	public void databaseAcesso(String[] database){
		/* Esse método pega o nome do database do o array e entra nele
		* Usa o try para acessar e o finally para fechar o arquivo
		*/
		// TODO: Implementar
	}
	public boolean verificadorDeDatabase(String nome){
		// TODO: Implementar a função
		/* Método que verifica se o database existe */
		return false;
	}
	public void imprimeCabecalho(String nomeDoDatabase){
		// TODO: Implementa a função

	} 
	public void imprimeGravacoes(String nomeDoDatabase) {
		// TODO: Implementar a função
	}
}
