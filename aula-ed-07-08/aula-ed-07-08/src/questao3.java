import java.util.ArrayList;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> X = new ArrayList<Integer>();
        int num;
        int maior = 0;
        int menor = 999999999;
        int posMaior = 0, posMenor = 0, dif;
        for (int i=0;i<10;i++){
            System.out.println("Digite o valor que deseja adicionar ao array: ");
            num = scan.nextInt();
            X.add(i, num);

            if (X.get(i) > maior){
                maior = X.get(i);
                posMaior = X.indexOf(X.get(i));
            }

            if (X.get(i) < menor) {
                menor = X.get(i);
                posMenor = X.indexOf(X.get(i));
            }


        }

        dif = maior - menor;

        System.out.println(X);
        System.out.println("O maior número é: " + maior);
        System.out.println("Sua posição é: " + posMaior);
        System.out.println("O menor número é: " + menor);
        System.out.println("Sua posição é: " + posMenor);
        System.out.println("A diferença entre os dois é de: " + dif);
    }
}
