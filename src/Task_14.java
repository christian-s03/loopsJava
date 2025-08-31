import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start from: ");
        int start = sc.nextInt();
        System.out.println("End at: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
