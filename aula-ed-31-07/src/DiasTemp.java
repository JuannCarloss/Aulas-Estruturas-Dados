public class DiasTemp {
    public static void main(String[] args) {
        double [] temp = new double[365];
        int i;
        temp[0] = 30;
        temp[1] = 28;
        temp[2] = 25;
        temp[3] = 32.5;
        temp[4] = 30.2;
        temp[5] = 22.4;

        for(i=0; i < temp.length; i++){
            System.out.println(temp[i]);
        }
    }
}