import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner input = new Scanner(System.in);

        String name1 = input.nextLine();

        String name2 = input.nextLine();

        name1 = name1.replace(" ","");


        name2= name2.replace(" ","");

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


    }
}