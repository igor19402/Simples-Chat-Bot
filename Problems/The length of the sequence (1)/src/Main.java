import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner entrada = new Scanner(System.in);

        int count = 0;
        int n;
        do {
            n = entrada.nextInt();
            if (n != 0) {
                count++;
            }
        } while (n != 0);

        System.out.println(count);



    }
}