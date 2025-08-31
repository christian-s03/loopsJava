import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many grades: ");
        int grades = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= grades; i++) {
            System.out.println("Give grade " + i + ": ");
            double grade = sc.nextDouble();
            sum += grade;
        }
        double average = sum / grades;
        System.out.println("Average grade: " + average);
    }
}
