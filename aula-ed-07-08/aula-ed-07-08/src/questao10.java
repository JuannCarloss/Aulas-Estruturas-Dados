import java.util.ArrayList;
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<Double> listaMedia = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String nomes, nomeMaior = "";
        double media, maiorMedia = 0.00;

        for (int i=0;i<3;i++){
            System.out.println("Digite seu nome: ");
            nomes = scan.next();
            alunos.add(nomes);
            System.out.println("Digite a média final deste aluno: ");
            media = scan.nextDouble();
            listaMedia.add(media);

            if (media > maiorMedia) {
                maiorMedia = media;
                nomeMaior = alunos.get(i);
            }

            if (media < 7) {
                System.out.println("aluno em recuperação, nota necessária para aprovação: " + (7 - media));
            }
        }


        System.out.println("---------------------------------------------------------------------------");
        System.out.println("o aluno com maior media é: " + nomeMaior + " e sua media foi: " + maiorMedia);

    }
}
