import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();

        int b = entrada.nextInt();

        int n = entrada.nextInt();

        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count += 1;
            }
        }

        System.out.println(count);


    }
}