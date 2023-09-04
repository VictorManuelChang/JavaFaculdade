
import java.util.Scanner;
import java.util.Locale; // Importe a classe Locale para definir a localização correta.

public class positivosEmedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH); // Defina a localização para leitura de números em formato inglês.

        double[] ls, lsdois;
        ls = new double[6];
        lsdois = new double[6];
        int countPositivos = 0; // Variável para contar os valores positivos.

        for (int i = 0; i < 6; i++) {
            ls[i] = sc.nextDouble();
            if (ls[i] > 0) {
                lsdois[countPositivos] = ls[i];
                countPositivos++; // Incrementa a contagem de valores positivos.
            }
        }

        double res = 0;
        for (int i = 0; i < countPositivos; i++) {
            res += lsdois[i];
        }
        System.out.println(countPositivos + " valores positivos");
        System.out.printf("%.1f\n", res / countPositivos); // Calcula e exibe a média dos valores positivos.

        sc.close();
    }
}
