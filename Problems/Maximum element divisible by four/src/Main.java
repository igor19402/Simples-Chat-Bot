import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int bigger = 0;

        for (int i = 1; i <= n; i++){
             int e = entrada.nextInt();
             if (e % 4 == 0){
                 if (e > bigger) {
                     bigger = e;
                 }
             }

        }

        System.out.println(bigger);
    }
}