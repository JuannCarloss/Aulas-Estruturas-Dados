import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();

        for (int i=0; i<3; i++){
            System.out.println("digite um numero para ser adicionado a primeira pilha: ");
            int num = scan.nextInt();
            p1.push(num);
        }

        for (int i=0; i<3; i++){
            System.out.println("digite um numero para ser adicionado a segunda pilha: ");
            int num = scan.nextInt();
            p2.push(num);
        }




        while(Objects.equals(p1, p2)){
            System.out.println("pilha exatamente igual");
            break;
        }


    }
}
