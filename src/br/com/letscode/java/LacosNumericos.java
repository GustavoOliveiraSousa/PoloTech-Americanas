package br.com.letscode.java;

public class LacosNumericos {
    public static void main(String[] args) {
        //Numeros de 0 à 10
        for (int i = 0; i <=10; i++){
            System.out.println("Tabuada do "+i);
            for (int j = 0; j <= 10; j++) {
                System.out.println(j + "x" + i +" = " + j * i);
            }
            System.out.println("");
        }
    }
}
