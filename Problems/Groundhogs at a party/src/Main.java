import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int peanut = scanner.nextInt();

        boolean doubt = scanner.nextBoolean();

        boolean result = ((peanut >= 15 && peanut <= 25) && doubt == true) 
        ||(peanut >= 10 && peanut <= 20) && doubt == false;

        System.out.println(result);

    }
}
