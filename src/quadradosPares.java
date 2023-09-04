import java.util.Scanner;

public class quadradosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        
        
        for (int i = 2; i <= n; i +=2 ) {
            res = i * i;
            System.out.println(i + "^2 = " + res);
            
            res = 0;
        }

        sc.close();
    }
}
