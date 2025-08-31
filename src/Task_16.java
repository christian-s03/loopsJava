import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number: ");
        int num = sc.nextInt();

        int numbers = 0;
        int temp = num;

        while (temp > 0){
            temp = temp / 10;
            numbers++;
        }
        System.out.println("Number of digits: " + numbers);
    }
}
