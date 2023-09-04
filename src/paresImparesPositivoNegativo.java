
import java.util.Scanner;
import java.util.Locale;

public class paresImparesPositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int[] primeiro;
        primeiro = new int[5];

        int contPar, contImpar, contNega, contPosi;

        contImpar = contPar = contNega = contPosi = 0;

        for(int i = 0; i < 5; i++) {
            primeiro[i] = sc.nextInt();
            if (primeiro[i] % 2 == 0) {
                contPar ++;
            }if (primeiro[i] % 2 != 0) {
                contImpar ++;
            }if (primeiro[i] > 0) {
                contPosi ++;
            }if (primeiro[i] < 0) {
                contNega ++;
            }
        }

        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPosi + " valor(es) positivo(s)");
        System.out.println(contNega + " valor(es) negativo(s)");
        sc.close();
    }
}
