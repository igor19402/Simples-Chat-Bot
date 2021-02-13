import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        System.out.print(n + " ");

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            }

            else if (n % 2 != 0) {
                n = n * 3 + 1;
            }

            System.out.print(n + " ");
        }

    }
}