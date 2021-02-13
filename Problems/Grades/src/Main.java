import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int ga = 0,gb = 0 ,gc = 0 ,gd = 0;

        for (int i = 1; i <= n; i++){
            int grade = entrada.nextInt();
            if (grade == 5){
                ga++;
            }
            else if (grade == 4){
                gb++;
            }
            else if (grade ==3){
                gc++;
            }
            else if (grade == 2){
                gd++;
            }
        }

         System.out.print(gd+" ");
         System.out.print(gc+" ");
         System.out.print(gb+" ");
         System.out.print(ga);



    }
}