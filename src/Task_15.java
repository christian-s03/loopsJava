import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        int num = sc.nextInt();

        long silnia = 1;

        for (int i = 1; i <= num ; i++) {
            silnia *= i;
        }
        System.out.println(num + "! = " + silnia);
    }
}
