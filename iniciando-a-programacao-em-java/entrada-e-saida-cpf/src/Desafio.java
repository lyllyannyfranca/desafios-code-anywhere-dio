import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        String[] cpf = new String[4];

        cpf = sc.nextLine().split("[\\W]"); // [\\W] -> separa a string por caractere.

        for (int i = 0; i < cpf.length; i++) {
            System.out.printf("%s\n", cpf[i]);
        }
        sc.close();
    }
}
