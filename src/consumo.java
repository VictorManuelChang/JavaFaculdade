

import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float res = a / b;

        System.out.printf("%.3f km/l%n", res);

        sc.close();
    }
}
