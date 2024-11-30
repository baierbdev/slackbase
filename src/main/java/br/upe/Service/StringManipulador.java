package br.upe.Service;

import sun.awt.www.content.audio.wav;

public class StringManipulador {
    public String[] quebrarStringEspaco(String string) throws Exception {
        String regex = "[,\\.\\s]";
        String[] strArr = string.split(regex);
        AnalisadorLexico.analisadorDeRotinas(strArr);

        return strArr;

    }
    public void quebrarStringVirgula(String string){
	    // TODO: Implementar a função, retorna um array de string
    } 
}
