


import java.util.Scanner;



import java.util.Locale;

public class somaimparConsecutivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);



        int a, b, res;
        a = sc.nextInt();
        b = sc.nextInt();
        res = 0;

        if (a > b) {
            for (int i = b + 1; i < a ; i++) {
                if (i % 2 != 0) {
                    res += i;
                }
            }
        } else {
            for (int i = a+1; i < b; i++){
                if (i % 2 != 0) {
                    res += i;
                }
            }
        }

        

        System.out.println(res);

        sc.close();
    }

}
