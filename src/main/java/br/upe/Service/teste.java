package br.upe.Service;

public class teste {
    public static void main(String[] args) {
        StringManipulador stringManipulador = new StringManipulador();
        try {
            stringManipulador.quebrarStringEspaco("create database clientes (\"nome\",\"sobrenome\",\"endereço\")");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
