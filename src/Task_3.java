import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
