import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give word: ");
        String word = sc.nextLine();

        System.out.println("Reverse word: ");
        for (int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
