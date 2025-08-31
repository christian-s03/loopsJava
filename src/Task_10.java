import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number: ");
        int num = sc.nextInt();

        for (int i = num + 1; ; i++) {
            if (i % 7 == 0) {
                System.out.println("First bigger number than " + num + " divisible by 7 is: " +i);
                break;
            }
        }
    }
}
