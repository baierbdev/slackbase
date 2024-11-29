package br.upe.Service;

public class SistemaOperacional {
	/* Classe responśavel pela portabilidade do sistema, tendo como
	 * foco o Linux e Windows.
	 */
	public static String pegaSistema(){
		return System.getProperty("os.name");
	}
}

