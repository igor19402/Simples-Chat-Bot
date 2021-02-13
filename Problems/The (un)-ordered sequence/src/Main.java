import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int ascending = 0;
        int descending = 0;
        while (true) {
            int ant = n;
            n = input.nextInt();
            if (n == 0) {
                break;
            }
            if (n >= ant) {
                ascending++;
                continue;
            }

            if (n <= ant) {
                descending++;
            }

        }
        if ((ascending != 0 && descending == 0) || (descending != 0 && ascending == 0 || ascending == 1) || ascending == 0 && descending == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}