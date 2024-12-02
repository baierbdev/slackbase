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
        stringManipulador = new StringManipulador();
        analisadorLexico = new AnalisadorLexico();
        String[] string = stringManipulador.quebrarStringEspaco(entrada);
        if(string.length > 3){
            stringManipulador.quebrarParametro3(string[3]);
        }

    }
}
