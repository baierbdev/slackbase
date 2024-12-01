package br.upe.Service;


public class StringManipulador {
    public static String[] quebrarStringEspaco(String string) throws Exception {
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();

        String regex = " (?=(?:[^']*'[^']*')*[^']*$)(?=(?:[^()]*\\([^()]*\\))*[^()]*$)";
        String[] strArr = string.split(regex);
        analisadorLexico.analisadorDeRotinas(strArr);
        quebrarParametro3(strArr[3]);

        return strArr;

    }

    public static String[] quebrarParametro3(String string){
        //usar esse metodo para quebrar o parametro 3 de rotina
        String res = string.replace("(", "").replace(")", "")
                .replace("'", "").replace(",", "");

        String[] arr = res.split(" ");
        return arr;
    }
}
