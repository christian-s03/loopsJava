import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String caption = sc.nextLine();

        for (int i = 0; i < caption.length(); i++) {
            if(caption.charAt(i)=='a'){
                System.out.println("First `a` is on position: " + i);
                return;
            }
        }
        System.out.println("There's no letter `a`");
    }
}
