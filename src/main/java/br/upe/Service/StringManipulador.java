package br.upe.Service;


public class StringManipulador {
    public static String[] quebrarStringEspaco(String string) throws Exception {
        String regex = "[,\\.\\s]";
        String[] strArr = string.split(regex);
        AnalisadorLexico.analisadorDeRotinas(strArr);

        return strArr;

    }
}
