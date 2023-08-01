import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        double[] temp = new double [365];
        Scanner scan = new Scanner (System.in);
        int i;
        int dias;
        System.out.println("digite a quantidade de dias a ser armazenado: ");
        dias = scan.nextInt();

        for(i=0; i < dias; i++) {
            System.out.println("DIA " + (i+1) + ":");
            temp[i] = scan.nextDouble();
        }

        for(i = 0; i < dias; i++) {
            System.out.println(temp[i]);
        }
    }
}