import java.io.IOException;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        int valor1 = leitor.nextInt();
        int valor2 = leitor.nextInt();

        if ( valor2 % valor1 == 0 || valor1 % valor2 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
