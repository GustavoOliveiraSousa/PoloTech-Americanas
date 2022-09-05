package br.com.letscode.java;

public class Booleanos {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        //TABELA VERDADE
        System.out.println(vamosAPraia);

        String mensagem = vamosAPraia ? "Oba, vamos a praia !!!" : "não vamos a praia";
        System.out.println(mensagem);
    }
}