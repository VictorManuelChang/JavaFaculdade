

import java.util.Scanner;

public class idadeEmDias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int ano = a / 365;
        a = a - (ano *365);
        int mes = a / 30;
        a = a - (mes *30);
        
        

        System.out.println( ano + " ano(s)");
        System.out.println( mes + " mes(es)");
        System.out.println( a +" dia(s)");


        sc.close();
    }
}