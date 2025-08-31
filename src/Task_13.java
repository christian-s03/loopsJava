import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctLogin = "admin";
        String correctPassword = "123";
        int attempt;

        for (attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Login: ");
            String login = sc.nextLine();
            System.out.println("Password: ");
            String password = sc.nextLine();

            if (login.equals(correctLogin) && password.equals(correctPassword)) {
                System.out.println("Logged in!");
                break;
            } else {
                System.out.println("Wrong login or password! Attempt: " + attempt + " out of 3");
            }
        }
        if (attempt > 3) {
            System.out.println("Account blocked");
        }
    }
}
