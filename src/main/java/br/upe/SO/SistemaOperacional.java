package br.upe.SO;

public class SistemaOperacional {
	/* Classe responśavel pela portabilidade do sistema, tendo como
	 * foco o Linux e Windows.
	 */

	public static void setaSistemaConfig(){
		String sistema = System.getProperty("os.name");
		switch ( sistema ){
			case "Linux":
				criaPathDeConfigLinux(pathLinux());
			default:
				criaPathDeConfigWindows(pathWindows());
		}

	}
	public static String pathWindows(){
		// Método usado para setar o path principal da aplicação
		return System.getProperty("user.dir\\Downloads\\slackbase");
	}
	public static String pathLinux(){
		// Método usado para setar o path principal da aplicação
		return System.getProperty("user.dir/.slackbase");
	}
	public static String criaPathDeConfigWindows(String path){
		// TODO: Criar path no Windows
		return "";
	}
	public static String criaPathDeConfigLinux(String path){
		// TODO: Criar path no linux path+"/.slackbase";
		return "";
	}
	public static boolean verificadorDeDatabase(String nome){
		// TODO: Implementar a função
		/* Método que verifica se o database existe */
		return false;
	}
}

