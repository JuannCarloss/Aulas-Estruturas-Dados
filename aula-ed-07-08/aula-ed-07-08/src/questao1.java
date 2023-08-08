import java.util.ArrayList;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        ArrayList<Integer> Array = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int num;
        int maior = 0;
        int menor = 999999999;
        int media;
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor desejado a se adicionar no array: ");
            num = scan.nextInt();
            soma = soma + num;
            Array.add(i, num);


            if (Array.get(i) > maior){
                maior = Array.get(i);
            }

            if (Array.get(i) < menor) {
                menor = Array.get(i);
            }
        }

        media = soma / 5;

        System.out.println(Array);
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A media entre eles é: " + media);

    }

}
