import java.util.Scanner;

public class SubsVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista;
        lista = new int[10];

        for (int i = 0; i < 10; i++) {
            lista[i] = sc.nextInt();
            if (lista[i] <= 0){
                lista[i] = 1;
            }
            System.out.println("X[" + i + "] = " + lista[i]);
        }
        sc.close();
    }
}   
