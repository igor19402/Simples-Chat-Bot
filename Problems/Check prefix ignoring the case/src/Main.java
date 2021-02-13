import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        name = name.toUpperCase();

        if (name.charAt(0) == 'J') {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}