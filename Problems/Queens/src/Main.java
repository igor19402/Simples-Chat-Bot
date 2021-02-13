import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner entrada = new Scanner(System.in);

        int x1 = entrada.nextInt();
        int y1 = entrada.nextInt();
        x1 = Math.abs(x1);
        y1 = Math.abs(y1);


        int x2 = entrada.nextInt();
        int y2 = entrada.nextInt();


        // 1ºpossibilidade --> Diagonal

        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)){
            System.out.println("YES");
        }

        // 3º possibilidade --> Vertical

        else if (x1 == x2) {
            System.out.println("YES");
        }
            // 2º possibilidade --> Horizontal
        else if (y1 == y2){
                System.out.println("YES");
            }


        else{
            System.out.println("NO");
        }


    }
}