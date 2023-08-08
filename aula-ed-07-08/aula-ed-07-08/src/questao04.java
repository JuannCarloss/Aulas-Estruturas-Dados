import java.util.Scanner;
import java.util.ArrayList;

public class questao04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int validate = 0;
        int num;
        ArrayList<Integer> A = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            System.out.println("Insira o valor");
            System.out.println(num = scan.nextInt());

            A.add(num);
        }

        for(int i = 0; i < 5; i++) {
            if(A.get(i) < 0) {
                System.out.println("O numero é "+ A.get(i));
                validate = 1;
                i = 5;
            }
            else{
                validate = 0;
            }
        }

        if(validate == 0) {
            System.out.println("Não tem numeros negativos");
        }
    }
}
