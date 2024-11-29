package br.upe.service;

public class StringManipulador {
    public static String[] quebrarString(String string){
    	// TODO: Retornar um array de strings

        String regex = "[,\\.\\s]";
        String[] strArr = string.split(regex);

        return strArr;

    }
}
