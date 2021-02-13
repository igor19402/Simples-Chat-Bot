import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int totalFoodDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int costNight = scanner.nextInt();
        int totalCost = (totalFoodDay * duration) + (flightCost * 2) + (costNight *(duration -1));

        System.out.println(totalCost);
    }
}