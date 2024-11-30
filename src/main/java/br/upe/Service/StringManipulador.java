package br.upe.Service;

public class StringManipulador {
    public static String[] quebrarString(String string){
        String regex = "[,\\.\\s]";
        String[] strArr = string.split(regex);
        return strArr;

    }
}
