package br.upe.IO;

import br.upe.Service.StringManipulador;

import static br.upe.Service.StringManipulador.quebrarString;

public class EntradaESaida {
    public static void receberEntrada(String entrada ) throws Exception {
	/* Método que tem como função enviara entrada 
	 * para as classes de serviços
	 */
        StringManipulador.quebrarString(entrada);
    }
}
