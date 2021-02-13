import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner entrada = new Scanner(System.in);

        double  a = entrada.nextInt();
        double b = entrada.nextInt();

        double sum = 0;
        double c = 0;

        for (double i = a; i <= b; i++){
            if (i % 3 == 0){
                sum += i;
                c++;

            }
        }

        double average = sum / c;

        System.out.println(average);
    }
}
