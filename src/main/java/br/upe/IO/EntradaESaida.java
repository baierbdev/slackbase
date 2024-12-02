package br.upe.IO;

import br.upe.Service.AnalisadorLexico;
import br.upe.Service.StringManipulador;


public class EntradaESaida {
    public void receberEntrada(String entrada ) throws Exception {
	/* Método que tem como função enviara entrada 
	 * para as classes de serviços
	 */
        StringManipulador stringManipulador = new StringManipulador();
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();
        String[] string = stringManipulador.quebrarStringEspaco(entrada);
        StringManipulador.quebrarParametro3(string[3]);
    }
}
