package br.upe.Service;

public class StringManipulador {
    public static String[] quebrarString(String string) throws Exception {
        String regex = "[,\\.\\s]";
        String[] strArr = string.split(regex);
        AnalisadorLexico.analisadorDeRotinas(strArr);

        return strArr;

    }
}
