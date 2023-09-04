
import java.io.IOException;
import java.util.Scanner;



public class area {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double res1 = (a * c) / 2;
        double res2 = c * c * 3.14159;
        double res3 = (a + b) * c / 2;
        double res4 = b * b;
        double res5 = a * b;


        System.out.printf("TRIANGULO: %.3f\n", res1);
        System.out.printf("CIRCULO: %.3f\n", res2);
        System.out.printf("TRAPEZIO: %.3f\n", res3);
        System.out.printf("QUADRADO: %.3f\n", res4);
        System.out.printf("RETANGULO: %.3f\n", res5);
        
       

        sc.close();
        
    }
    
}
