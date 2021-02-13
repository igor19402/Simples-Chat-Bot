import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();

        boolean result = (n1 >= n2 && n1 <= n3) || (n1 <= n2 && n1 >= n3);

        System.out.println(result);
    }
}