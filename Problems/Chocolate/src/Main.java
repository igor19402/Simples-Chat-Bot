import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner entrada = new Scanner(System.in);

        int M = entrada.nextInt();
        int N = entrada.nextInt();
        int k = entrada.nextInt();


            if( (M * N >= k) && (k % M ==0 || k % N == 0)){
                    System.out.println("YES");

            } else{
                    System.out.println("NO");
                }
            }
        }


