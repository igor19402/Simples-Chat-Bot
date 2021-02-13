import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();



        for (int r = 0; r <= 1000; r++){
            if(a * Math.pow(r,3) + b * Math.pow(r,2) + c * Math.pow(r,1) + d == 0){
                System.out.println(r);
                }
            }

    }
}
