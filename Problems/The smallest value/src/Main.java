import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long fact = 1;
        int cont = 1;
        while (fact <= n) {
            fact *= cont;
            cont++;
        }
        System.out.println(cont - 1);
    }
}