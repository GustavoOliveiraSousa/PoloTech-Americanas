import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
//        int [] numeros = new int [5];
//        numeros[0] = 1;
//        numeros[1] = 2;
//        numeros[2] = 3;
//        numeros[3] = 4;
//        numeros[4] = 5;
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }
//
//        System.out.println(Arrays.toString(numeros));

        int [] numeros = {9,10,12,45,32,6};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < maior) {
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        System.out.println("Media: "+media/ numeros.length);
    }
}
