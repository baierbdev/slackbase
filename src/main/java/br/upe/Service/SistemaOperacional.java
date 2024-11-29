package br.upe.Service;

public class SistemaOperacional {
	/* Classe responśavel pela portabilidade do sistema, tendo como
	 * foco o Linux e Windows.
	 */
	public static String pegaSistema(){
		return System.getProperty("os.name");
	}
	public static String pathWindows(){
		return System.getProperty("user.dir");
	}
	public static String pathLinux(){
		return System.getProperty("user.dir");
	}
	public static String criaPathDeConfigWindows(String path){
		// TODO: Criar path no Windows
		return "";
	}
	public static String criaPathDeConfigLinux(String path){
		// TODO: Criar path no linux path+"/.slackbase";
		return "";
	}
}

