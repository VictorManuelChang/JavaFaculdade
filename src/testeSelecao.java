


import java.util.Scanner;

public class testeSelecao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        
        if (a <= 25 && a >= 0) {
            System.out.println("Intervalo [0,25]");
        } else if (a <= 50 && a > 25) {
            System.out.println("Intervalo (25,50]");
        } else  if (a  <= 75 && a > 50) {
            System.out.println("Intervalo (50,75]");
        } else  if (a <= 100 && a > 75) {   
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }


       
        


        sc.close();
    }
}