import java.util.Scanner;

public class preenchimentoVetor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        

        for (int i = 0; i < 10; i++) {
            
            System.out.println("N[" + i + "] = " + a);
            a *= 2;

        }
        sc.close();
    }
}   
