import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "java123";
        String entered = "";

        while (!entered.equals(password)) {
            System.out.print("Enter your password: ");
            entered = sc.nextLine();
        }
        System.out.println("Logged in!");
    }
}
