package br.upe.SO;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

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
		/* Esse método pega o nome do databas entra nele e
		 * faz o update do banco de dados
		 */
		
	}

	public boolean verificadorDeDatabase(String nomeDoDatabase){
		/* Método que verifica se o database existe */
		String path  = SistemaOperacional.systemReturnPath()+nomeDoDatabase+".csv";
		File database = new File(path);
		if ( !database.exists() ){
			return false;
		}else{
			return true;
		}
	}
	public void imprimeCabecalho(String nomeDoDatabase){
		String path  = SistemaOperacional.systemReturnPath()+nomeDoDatabase+".csv";
		try ( Reader reader = Files.newBufferedReader(Paths.get(path));
				CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build() ){
			List<String[]> gravacao = csvReader.readAll();
			if (!gravacao.isEmpty()){
				String[] cabecalho = gravacao.get(0);
				for (String cabecalhoImprime : cabecalho){
					System.out.printf("| %s | ",cabecalhoImprime);
				}
			}
		}catch (IOException e){
		System.out.println("Database específicado não existe!");
		}
	}

 
	public void imprimeGravacoes(String nomeDoDatabase) {
		String path  = SistemaOperacional.systemReturnPath()+nomeDoDatabase+".csv";

		try ( Reader reader = Files.newBufferedReader(Paths.get(path));
			CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build() ){

			List<String[]> gravacao = csvReader.readAll();
			for (String[] linhaGravada : gravacao){
				for (String printLinha : linhaGravada ){
					System.out.println(printLinha);
				}
			}
		}catch (IOException e){
		System.out.println("Database específicado não existe!");
	}
}
}
