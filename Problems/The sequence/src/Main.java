import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int biggerFour = 1;

        int count = 1;

        int number;

        while (count <= n) {
            number = input.nextInt();
            if (number % 4 == 0) {
                if (number >= biggerFour) {
                    biggerFour = number;
                }
            }
            count++;
        }
        System.out.println(biggerFour);
    }
}