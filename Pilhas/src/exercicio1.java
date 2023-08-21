import java.util.Stack;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int num;

        for (int i=0; i<3; i++){
            System.out.println("digite um numero para ser adicionado a pilha: ");
            num = scan.nextInt();
            p1.push(num);
        }

        for (int i=0; i<3; i++){
            p2.push(p1.get(i));
        }

        System.out.println(p1);
        System.out.println(p2);

    }
}
