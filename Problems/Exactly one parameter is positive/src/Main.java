import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean result1  = (n1 > 0 && n2 <= 0 && n3 <= 0 ) || (n2 > 0 && n1 <= 0 && n3 <= 0 ) || (n3 >0 && n2 <=0 && n1 <= 0 );
        System.out.println(result1);
    }
}