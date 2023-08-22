import java.util.Stack;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();
        Stack<Integer> p3 = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int num;

        for (int i=0; i<3; i++){
            System.out.println("digite um numero para ser adicionado a pilha: ");
            num = scan.nextInt();
            p1.push(num);
        }

        while(!p1.isEmpty()){
            p2.push(p1.pop());
        }

        while(!p2.isEmpty()){
            int x = p2.pop();
            p1.push(x);
            p3.push(x);
        }

        System.out.println(p1);
        System.out.println(p3);

    }
}
