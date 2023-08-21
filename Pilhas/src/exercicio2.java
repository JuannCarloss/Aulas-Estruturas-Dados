import java.util.Stack;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Stack<Integer> p = new Stack<>();
        Stack<Integer> p2 = new Stack<>();
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<3; i++){
            System.out.println("digite um numero para ser adicionado a pilha: ");
            int num = scan.nextInt();
            p.push(num);
        }

        System.out.println(p);

        for (int i=p.size() - 1; i >= 0; i--){
            p2.push(p.get(i));
        }

        for (int i=0; i<3; i++){
            p.pop();
        }

        for (int i=0; i<3; i++){
            p.push(p2.get(i));
        }

        System.out.println(p);

    }
}
