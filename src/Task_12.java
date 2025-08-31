import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Give number: ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
