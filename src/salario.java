

import java.util.Scanner;

public class salario {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int fun = sc.nextInt();
        int horas = sc.nextInt();
        float valor = sc.nextFloat();
        float res = valor * horas;

        System.out.println("NUMBER = " + fun);
        System.out.printf("SALARY = U$ %.2f%n", res);

        sc.close();

    }
}
