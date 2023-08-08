import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        ArrayList<String> arraylist = new ArrayList<String>();
        String nome;

        for (int i=0;i<3;i++) {
            System.out.println("digite os nomes: ");
            nome = scan.next();
            arraylist.add(i, nome);
        }

            System.out.println(arraylist);

    }
}