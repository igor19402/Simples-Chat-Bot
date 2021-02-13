import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();

        int factor = 2 - input%2;

        System.out.println(input + factor);



    }
}