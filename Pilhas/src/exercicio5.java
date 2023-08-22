import java.util.Objects;
import java.util.Stack;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Stack<Character> p1 = new Stack<>();
        Stack<Character> p2 = new Stack<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a palavra que deseja verificar");
        String palavra = scan.next();

        for (int i=0; i<palavra.length(); i++){
            p1.push(palavra.charAt(i));
        }

        for (int i = p1.size() - 1; i>=0; i--){
            p2.push(palavra.charAt(i));
        }

        if (Objects.equals(p1, p2)){
            System.out.println("palavra palindromo");
        }else {
            System.out.println("não é palindromo");
        }
    }
}
