
import java.util.Scanner;
import java.util.Locale;

public class AreaSuperiorMatriz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
    
        double[][] matriz; 
        matriz = new double[12][12];
        double total = 0;
        int n = 1;
        int m = 11;
        char op = sc.next().charAt(0);  

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }
        
        if (op == 'S') {
            for (int i = 0 ; i < 5; i++) {
                for (int j = n; j < m; j++) {
                    total += matriz[i][j];
                }
                n++;
                m--;
            }
        } else if (op == 'M') {
             for (int i = 0 ; i < 5; i++) {
                for (int j = n; j < m; j++) {
                    total += matriz[i][j];
                }
                n++;
                m--;
            }
            total /= 30;
        }
        System.out.printf("%.1f\n", total);
       

        sc.close();
    }
}
