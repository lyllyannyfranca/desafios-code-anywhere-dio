import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("[\\W]");

        float time = Float.parseFloat(input[0]);
        float speed = Float.parseFloat(input[1]);
        float liter = (time * speed) / 12;

        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println(df.format(liter).replace(",", "."));
    }
}
