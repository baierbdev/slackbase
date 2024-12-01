package br.upe.SO;

import java.io.File;


public class SistemaOperacional {
	/* Classe responśavel pela portabilidade do sistema, tendo como
	 * foco o Linux e Windows.
	 */

	public void setaSistemaConfig(){
		String sistema = System.getProperty("os.name").toLowerCase();
		if ( sistema.contains("linux") ) {
			criaPathDeConfigLinux(pathLinux());
		} else {
			criaPathDeConfigWindows(pathWindows());
		}

	}
	public static String systemReturnPath(){
		if ( System.getProperty("os.name").toLowerCase().equals("linux") ){
			return pathLinux();
		}else{
			return pathWindows();
		}
	}
	public static String pathWindows(){
		// Método usado para setar o path principal da aplicação
		return System.getProperty("user.dir") +"\\Downloads\\slackbase";
	}
	public static String pathLinux(){
		// Método usado para setar o path principal da aplicação
		return System.getProperty("user.dir") +"/Downloads/slackbase";
	}
	public void criaPathDeConfigWindows(String path){
		File pathWindows = new File(path);
		if ( !pathWindows.exists() ){
			pathWindows.mkdirs();
		}	
	}
	public void criaPathDeConfigLinux(String path){
		File pathLinux = new File(path);
		if (!pathLinux.exists()){
			pathLinux.mkdirs();
		}
	}
	
}

