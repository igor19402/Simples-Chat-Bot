import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n % 10;
        n = n / 10;
        int b = n % 10;
        n = n / 10;
        int c = n;
        System.out.println(a + b + c);

    }
}
