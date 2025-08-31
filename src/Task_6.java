import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number: ");
        int n = sc.nextInt();

        while(n >= 0){
            System.out.println(n);
            n--;
        }
    }
}
