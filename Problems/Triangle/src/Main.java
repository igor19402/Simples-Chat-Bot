import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES"); 
            }
        else {
            System.out.println("NO");
        }

    }
}
