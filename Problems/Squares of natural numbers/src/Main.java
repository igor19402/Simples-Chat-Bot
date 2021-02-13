import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int i = 1;
        int result = 1;
        while (result <= n) {
            System.out.println(result);
            i++;
            result = i * i;
        }
    }
}