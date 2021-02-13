import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int u = n % 10;
        n = n / 10;
        int d = n % 10;
        n = n / 10;
        int c = n % 10;
        n = n / 10;
        int m = n % 10;

       /* System.out.println(u);
        System.out.println(d);
        System.out.println(c);
        System.out.println(m); */

        if (u == m && d == c){
            System.out.println(1); }

        else {
            System.out.println(13);
        }




    }
}
