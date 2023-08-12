import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class questao9 {
    public static void main(String[] args) {
        ArrayList<Integer> logica = new ArrayList<>(Arrays.asList(2513, 2134, 5412, 4217, 2121, 3749, 4012, 5122, 2387, 3888, 3122, 5551, 5432, 2122, 2098));
        ArrayList<Integer> linguagem = new ArrayList<>(Arrays.asList(3444, 2121, 4331, 2387, 5551, 4335, 2766, 2098, 4775, 3749));
        ArrayList<Integer> simult = new ArrayList<>();


        for (int i=0;i<logica.size();i++){
            for (int j = 0; j < linguagem.size(); j++) {
                if (Objects.equals(logica.get(i), linguagem.get(j))) {
                    simult.add(linguagem.get(j));
                }
            }
        }

        System.out.println(simult);

    }
}
