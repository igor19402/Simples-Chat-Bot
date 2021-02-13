import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        int maior = n;

        while (n != 0) {
            n = entrada.nextInt();
            if (n >= maior) {
                maior = n;
            }
        }
        if (maior != 0) {
            System.out.println(maior);
        }

    }
}