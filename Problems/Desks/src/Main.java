import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int g3 = scanner.nextInt();
        int desks1= (g1/2 + g1%2);
        int desks2= (g2/2 + g2%2);
        int desks3= (g3/2 + g3%2);
        int totalDesks = desks1+ desks2 + desks3;
        System.out.println(totalDesks);

    }
}