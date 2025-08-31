import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number x: ");
        int x = sc.nextInt();
        System.out.println("Give number y: ");
        int y = sc.nextInt();

        int result = 1;

        for(int i = 1; i <= y; i++) {
            result *= x;
        }
        System.out.println("Result of exponentiation is " + result);
    }
}
