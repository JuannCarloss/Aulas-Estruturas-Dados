import java.util.ArrayList;
import java.util.Scanner;
public class questao7 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> salario = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        double sal;
        String nome;
        double reajuste;

        for (int i=0;i<20;i++){
            System.out.println("digite seu nome");
            nome = scan.next();
            nomes.add(nome);
            System.out.println("digite seu salario");
            sal = scan.nextDouble();
            reajuste = sal * 1.08;
            salario.add(reajuste);
        }

        for (int i=0;i<20;i++){
            System.out.println(nomes.get(i) + ": " + salario.get(i));
        }
    }
}
