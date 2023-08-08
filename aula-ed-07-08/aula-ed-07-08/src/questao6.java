import java.util.ArrayList;
import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        int num;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o valor a ser inserido no array: ");
            num = scan.nextInt();
            A.add(i, num);
        }

        for (int i = 5; i >= 0; i--){
            B.add(i, A.get(i));
        }

        System.out.println(A);
        System.out.println(B);
    }
}
