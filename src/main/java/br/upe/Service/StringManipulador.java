package br.upe.Service;


public class StringManipulador {
    AnalisadorLexico analisadorLexico;
    public String[] quebrarStringEspaco(String string) throws Exception {
        analisadorLexico = new AnalisadorLexico();
        String regex = " (?=(?:[^']*'[^']*')*[^']*$)(?=(?:[^()]*\\([^()]*\\))*[^()]*$)";
        String[] strArr = string.split(regex);
        analisadorLexico.analisadorDeRotinas(strArr);
        if (strArr.length > 3){
            quebrarParametro3(strArr[3]);
        }
        return strArr;

    }

    public String[] quebrarParametro3(String string){
        //usar esse metodo para quebrar o parametro 3 de rotina
        String res = string.replace("(", "").replace(")", "");

        return res.split(",");
    }
}
