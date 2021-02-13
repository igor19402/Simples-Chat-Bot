import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int qlarger = 0;
        int qsmaller = 0;
        int qperfect = 0;

        for (int i = 1; i <= n; i++) {
            int element = entrada.nextInt();
            if (element == 1) {
                qlarger += 1;
            }
            else if (element == -1) {
                qsmaller += 1;
            }
            else if (element == 0) {
                qperfect += 1;
            }
        }

        System.out.print(qperfect + " ");
        System.out.print(qlarger + " ");
        System.out.print(qsmaller );
    }
}