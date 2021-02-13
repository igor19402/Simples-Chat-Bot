import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        int sum = 0;
        int e = 0;
        for (int i = 1; i <= n; i++) {
            e = entrada.nextInt();
            if (e % 6 == 0) {
                sum = sum + e;
            }
        }

        System.out.println(sum);
    }
}
