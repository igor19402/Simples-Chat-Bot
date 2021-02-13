import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int H = entrada.nextInt();

        if(H < A ){
            System.out.println("Deficiency");
        }
        else if(H > B){
            System.out.println("Excess");
        }
        else{
            System.out.println("Normal");
        }

    }
}