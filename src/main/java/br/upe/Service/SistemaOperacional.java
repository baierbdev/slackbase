package br.upe.Service;

public class SistemaOperacional {
	/* Classe responśavel pela portabilidade do sistema, tendo como
	 * foco o Linux e Windows.
	 */

	public static void setaSistemaConfig(){
		String sistema = System.getProperty("os.name");
		switch ( sistema ){
			case "Linux":
				criaPathDeConfigLinux(pathLinux());
			case "Windows":
				criaPathDeConfigWindows(pathLinux());
		}

	}
	public static String pathWindows(){
<<<<<<< HEAD
		return System.getProperty("user.dir\\Downloads\\slackbase");
	}
	public static String pathLinux(){
		return System.getProperty("user.dir/.slackbase");
=======
		return System.getProperty("user.dir");
	}
	public static String pathLinux(){
		return System.getProperty("user.dir");
>>>>>>> d0ca6ca (Implementando algumas funções na classe SistemaOperacional)
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

