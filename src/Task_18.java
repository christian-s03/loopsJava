import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;

        System.out.println("Give number: ");

        while (true) {
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The largest number is: " + max);
    }
}
