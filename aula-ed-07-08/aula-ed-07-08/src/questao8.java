import java.util.ArrayList;
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        ArrayList<Integer> inteiro = new ArrayList<>();
        ArrayList<Integer> posP = new ArrayList<>();
        ArrayList<Integer> posI = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int num, par = 0, imp = 0;

        for (int i=0;i<6;i++){
            System.out.println("digite 6 numeros: ");
            num = scan.nextInt();
            inteiro.add(num);

            if (num%2==0){
                par++;
                posP.add(inteiro.get(i));
            }else {
                imp++;
                posI.add(inteiro.get(i));
            }
        }
        System.out.println("os pares são: " + posP);
        System.out.println("a quantidade de pares é: " + par);
        System.out.println("--------------------------------");
        System.out.println("os impares são: " + posI);
        System.out.println("a quantidade de impares é: " + imp);

    }
}
