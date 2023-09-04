import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] primeiro = new int[n];  // Correção no tamanho do array

        for (int i = 0; i < n; i++) {
            primeiro[i] = sc.nextInt();

            if (primeiro[i] == 0) {
                System.out.println("NULL");
            } else if (primeiro[i] % 2 != 0) {
                System.out.print("ODD ");  // Use print para não criar nova linha
            } else {
                System.out.print("EVEN ");  // Use print para não criar nova linha
            }

            if (primeiro[i] > 0) {
                System.out.println("POSITIVE");
            } else if (primeiro[i] < 0) {  // Correção para evitar imprimir "NEGATIVE" duas vezes
                System.out.println("NEGATIVE");
            }
        }

        sc.close();
    }
}
