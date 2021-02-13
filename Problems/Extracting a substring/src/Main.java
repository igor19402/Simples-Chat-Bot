import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        int a = input.nextInt();
        int b = input.nextInt();


        System.out.println(name.substring(a, b+1));
    }
}