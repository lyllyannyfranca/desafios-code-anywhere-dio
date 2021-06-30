import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = Double.parseDouble(sc.nextLine());

        double pi = 3.14159;
        double area = pi * (Math.pow(raio, 2));

        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.println("A=" + df.format(area).replace(",", "."));
    }
}
