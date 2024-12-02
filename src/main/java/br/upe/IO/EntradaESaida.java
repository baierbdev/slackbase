package br.upe.IO;

import br.upe.Service.AnalisadorLexico;
import br.upe.Service.StringManipulador;


public class EntradaESaida {
    StringManipulador stringManipulador;
    AnalisadorLexico analisadorLexico;
    public void receberEntrada(String entrada ) throws Exception {
	/* Método que tem como função enviara entrada 
	 * para as classes de serviços
	 */
        String[] string = stringManipulador.quebrarStringEspaco(entrada);
        stringManipulador.quebrarParametro3(string[3]);
    }
}
