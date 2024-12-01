package br.upe.IO;

import br.upe.Service.StringManipulador;


public class EntradaESaida {
    public static void receberEntrada(String entrada ) throws Exception {
	/* Método que tem como função enviara entrada 
	 * para as classes de serviços
	 */
        StringManipulador.quebrarStringEspaco(entrada);
//      StringManipulador.quebrarParametro3(entrada);
    }
}
