import java.util.ArrayList;
import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();

        A.add(7);
        A.add(21);
        A.add(15);
        A.add(12);
        A.add(82);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int numberToFind = scanner.nextInt();

        boolean found = false;
        int index = -1;

        for (int i = 0; i < A.size(); i++)
        {
            if (A.get(i) == numberToFind)
            {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Elemento encontrado na posição: " + index);
        } else {
            System.out.println("Elemento não encontrado.");
        }

        scanner.close();
    }
}