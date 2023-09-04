
import java.util.Scanner;



import java.util.Locale;

public class valoresPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int[] primeiro;
        primeiro = new int[5];

        int cont = 0;

        for (int i = 0; i < 5; i++) {
            primeiro[i] = sc.nextInt();
            if (primeiro[i] % 2 == 0) {
                cont ++;
            }
            
        }

        System.out.println(cont + " valores pares");

        sc.close();
    }

}
