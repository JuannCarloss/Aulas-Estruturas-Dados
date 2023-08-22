import java.util.Stack;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();
        Stack<Integer> p3 = new Stack<>();
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<3; i++){
            System.out.println("digite um numero para ser adicionado a pilha: ");
            int num = scan.nextInt();
            p1.push(num);
        }

        System.out.println("primeira versao p1");
        System.out.println(p1);


        while(!p1.isEmpty()){
            p2.push(p1.pop());
        }

        System.out.println("pilha p2");
        System.out.println(p2);


        while (!p2.isEmpty()){
            p3.push(p2.pop());
        }

        System.out.println("pilha p3");
        System.out.println(p3);

        while (!p3.isEmpty()){
            p1.push(p3.pop());
        }

        System.out.println("nova pilha p1");
        System.out.println(p1);

    }
}
