import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println(name.replace('a', 'b'));
    }
}