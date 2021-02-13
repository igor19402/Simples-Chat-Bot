import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        if (n > 0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}