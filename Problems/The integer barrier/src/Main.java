import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner input = new Scanner(System.in);

        int sum = 0;

        int n;

        while (input.hasNext()) {
            n = input.nextInt();
            if (n == 0) {
                System.out.println(sum);
                break;
            }
            sum += n;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }

        }
    }
}