import java.util.Scanner;



public class intervaloDois {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] primeiro;
            primeiro = new int[10000];
            int contin, contout;
            contin = contout = 0;
    

            for (int i = 0; i < n; i++){
                primeiro[i] = sc.nextInt();
                if (primeiro[i] >= 10 && primeiro[i] <= 20){
                    contin ++;
                } else {
                    contout ++;
                }
            }

            System.out.println(contin + " in");
            System.out.println(contout + " out");
            sc.close();
    }



}
