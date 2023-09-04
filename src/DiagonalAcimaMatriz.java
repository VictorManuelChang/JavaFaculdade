
import java.util.Scanner;
import java.util.Locale;

public class DiagonalAcimaMatriz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
    
        float[][] matriz; 
        matriz = new float[12][12];
        float total = 0;
        int n = 10;
        char op = sc.next().charAt(0);  

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextFloat();
            }
        }
        
        if (op == 'S') {
            for (int i = 0 ; i < 11; i++) {
                for (int j = n; j >= 0; j--) {
                    total += matriz[i][j];
                }
                n--;
            }
        } else if (op == 'M') {
            for (int i = 0 ; i < 11; i++) {
                for (int j = n; j >= 0; j--) {
                    total += matriz[i][j];  
                }
                n--;
            }
            total /= 66;
        }
        System.out.printf("%.1f\n", total);
       

        sc.close();
    }
}
