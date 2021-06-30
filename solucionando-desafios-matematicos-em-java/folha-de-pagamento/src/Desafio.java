import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Desafio {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numeroColaboradores = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int qtdHorasTrabalhadas = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valorHora = Double.parseDouble(st.nextToken());

        DecimalFormat df = new DecimalFormat("0.00");

        double salario = qtdHorasTrabalhadas * valorHora; // Altere o valor da variável com o cálculo esperado
        System.out.println("NUMBER = " + numeroColaboradores);
        System.out.printf("SALARY = U$ " + df.format(salario).replace(",", "."));
    }
}
