import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner input = new Scanner(System.in);
        while (true) {
            int n = input.nextInt();
            if (n % 2 == 0 && n != 0) {
                System.out.println("even");
            }
            else if (n % 2 != 0) {
                System.out.println("odd");
            }
            else if (n == 0) {
                break;
            }
        }
    }
}