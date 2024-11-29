package br.upe.service;

public class SistemaOperacional {
	// TODO: Implementar classes para portabilidade
	private String os;

	public String getOperatingSystem(){
		return System.getProperty("os.name");
	}
}

