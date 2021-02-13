import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numberBridges = input.nextInt();
        int count = 1;
        int hit = 0;
        while (count <= numberBridges) {
            int heightBridge = input.nextInt();
            if (n >= heightBridge) {
                System.out.println("Will crash on bridge" + " " + count);
                hit++;
                break;
            }
            count++;
        }
        if (hit == 0) {
            System.out.println("Will not crash");
        }


    }
}