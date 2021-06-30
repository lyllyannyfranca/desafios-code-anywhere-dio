import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int[] entradas = new int[5];

        for (int i = 0; i < entradas.length; i++) {entradas[i] = leitor.nextInt();}

        for (int j = 0; j < entradas.length; j++) {

            if (entradas[j] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (entradas[j] > 0) {positivos++;}
            if (entradas[j] < 0) {negativos++;}

        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}
