import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();

        int b = entrada.nextInt();
        long product = 1;
        for (int i = a; i < b; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}