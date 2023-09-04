import java.util.Scanner;

public class matrizQuadrada1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int[][] matriz = new int[n][n];
            int valor = 1;
            int limite = (n + 1) / 2;

            for (int i = 0; i < limite; i++) {
                int last = n - i - 1;
                for (int j = i; j <= last; j++) {
                    matriz[i][j] = valor;
                    matriz[j][i] = valor;
                    matriz[last][j] = valor;
                    matriz[j][last] = valor;
                }
                valor++;
            }

            for (int i = 0; i < n; i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < n - 1; j++) {
                    row.append(String.format("%3d", matriz[i][j])).append(" ");
                }
                row.append(String.format("%3d", matriz[i][n - 1]));
                System.out.println(row);
            }
            System.out.println();
        }

        sc.close();
    }
}
