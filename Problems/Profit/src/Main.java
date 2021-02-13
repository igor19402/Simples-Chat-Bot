import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner entrada = new Scanner(System.in);

        double m = entrada.nextDouble();

        double p = entrada.nextDouble();

        double k = entrada.nextDouble();

        int years = 0;

        while (m < k) {
            m =  m * (1 + p / 100);
            years++;
        }

        System.out.println(years);


    }
}