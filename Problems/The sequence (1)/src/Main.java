import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                count++;
                if (count == n) {
                    break;
                }

            }
            if (count == n) {
                break;
            }
        }
    }
}