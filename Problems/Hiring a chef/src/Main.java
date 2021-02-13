import java.util.Scanner;
//put imports you need here

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner entrada = new Scanner(System.in);

        String firstName = entrada.next();
        entrada.next();
        entrada.next();
        entrada.next();
        String cuisinePreference = entrada.next();
        System.out.println("The form for "+firstName+" is completed. We will contact you " +
                "if we need a chef that cooks "+cuisinePreference+" dishes.");


    }
}