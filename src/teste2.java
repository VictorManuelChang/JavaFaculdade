import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {

            int aux = n - 1;
            int com = 1;
            int[][] matriz;
            matriz = new int[n][n]; // Cria matriz n por n

            // preenche toda a matriz com 1
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = 1;
                }
            }

            while (aux > 0) {

                for (int i = com; i < aux; i++) {
                    for (int j = com; j < aux; j++) {
                        matriz[i][j] += 1;
                    }
                }
                aux--;
                com++;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    String fim = (j != n - 1) ? " " : "";
                    System.out.printf("%-3d%s", matriz[i][j], fim); // Alteração aqui: adicionei um sinal de menos
                }
                System.out.println("");
            }

            System.out.println("");
            n = sc.nextInt();
        }

        sc.close();
    }
}
