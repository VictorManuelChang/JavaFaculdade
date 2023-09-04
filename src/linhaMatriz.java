
import java.util.Scanner;
import java.util.Locale;

public class linhaMatriz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
        int linha = sc.nextInt();
        float[][] matriz; 
        matriz = new float[12][12];
        float total = 0;

        char op = sc.next().charAt(0);  

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextFloat();
            }
        }
        
        if (op == 'S') {
            for (int j = 0; j < 12; j++) {
                total += matriz[linha][j];
            }
        } else if (op == 'M') {
            for (int j = 0; j < 12; j++) {
                total += matriz[linha][j];
            }
            total /= 12;
        }
        System.out.printf("%.1f\n", total);
       

        sc.close();
    }
}
