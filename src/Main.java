import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Task 2

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give number: ");
//        int num = sc.nextInt();
//
//        for (int i = 0; i <= num; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        // Task 3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give number: ");
//        int num = sc.nextInt();
//
//        int sum = 0;
//
//        for (int i = 0; i <= num; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        // Task 4

//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }

        // Task 5

//        Scanner sc = new Scanner(System.in);
//        String caption = sc.nextLine();
//
//        for (int i = 0; i < caption.length(); i++) {
//            if(caption.charAt(i)=='a'){
//                System.out.println("First `a` is on position: " + i);
//                return;
//            }
//        }
//        System.out.println("There's no letter `a`");

        // Task 6

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give number: ");
//        int n = sc.nextInt();
//
//        while(n >= 0){
//            System.out.println(n);
//            n--;
//        }

        // Task 7

//        Scanner sc = new Scanner(System.in);
//        String password = "java123";
//        String entered = "";
//
//        while (!entered.equals(password)) {
//            System.out.print("Enter your password: ");
//            entered = sc.nextLine();
//        }
//        System.out.println("Logged in!");

        // Task 8

//        Scanner sc = new Scanner(System.in);
//        int number;
//
//        do {
//            System.out.print("Enter a number: ");
//            number = sc.nextInt();
//        } while (number <= 0);
//        System.out.println("You entered: " + number);

        // Task 9

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give number: ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }

        // Task 10

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give number: ");
//        int num = sc.nextInt();
//
//        for (int i = num + 1; ; i++) {
//            if (i % 7 == 0) {
//                System.out.println("First bigger number than " + num + " divisible by 7 is: " +i);
//                break;
//            }
//        }

        // Task 11

//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

        // Task 12

//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//
//        while (true) {
//            System.out.println("Give number: ");
//            int num = sc.nextInt();
//
//            if (num == 0) {
//                break;
//            }
//            if (num > 0) {
//                sum += num;
//            }
//        }
//        System.out.println(sum);

        // Task 12

//        Scanner sc = new Scanner(System.in);
//
//        String correctLogin = "admin";
//        String correctPassword = "123";
//        int attempt;
//
//        for (attempt = 1; attempt <= 3; attempt++) {
//            System.out.println("Login: ");
//            String login = sc.nextLine();
//            System.out.println("Password: ");
//            String password = sc.nextLine();
//
//            if (login.equals(correctLogin) && password.equals(correctPassword)) {
//                System.out.println("Logged in!");
//                break;
//            } else {
//                System.out.println("Wrong login or password! Attempt: " + attempt + " out of 3");
//            }
//        }
//        if (attempt > 3) {
//            System.out.println("Account blocked");
//        }

        // Task 14

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Start from: ");
//        int start = sc.nextInt();
//        System.out.println("End at: ");
//        int end = sc.nextInt();
//
//        for (int i = start; i <= end; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                System.out.println(i);
//            }
//        }

        // Task 15

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give a number: ");
//        int num = sc.nextInt();
//
//        long silnia = 1;
//
//        for (int i = 1; i <= num ; i++) {
//            silnia *= i;
//        }
//        System.out.println(num + "! = " + silnia);

        // Task 16 **

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give number: ");
//        int num = sc.nextInt();
//
//        int numbers = 0;
//        int temp = num;
//
//        while (temp > 0){
//            temp = temp / 10;
//            numbers++;
//        }
//        System.out.println("Number of digits: " + numbers);

        // Task 17

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give number x: ");
//        int x = sc.nextInt();
//        System.out.println("Give number y: ");
//        int y = sc.nextInt();
//
//        int result = 1;
//
//        for(int i = 1; i <= y; i++) {
//            result *= x;
//        }
//        System.out.println("Result of exponentiation is " + result);

        // Task 18

//        Scanner sc = new Scanner(System.in);
//        int number;
//        int max = Integer.MIN_VALUE;
//
//        System.out.println("Give number: ");
//
//        while (true) {
//            number = sc.nextInt();
//            if (number == 0) {
//                break;
//            }
//            if (number > max) {
//                max = number;
//            }
//        }
//        System.out.println("The largest number is: " + max);

        // Task 19

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("How many grades: ");
//        int grades = sc.nextInt();
//
//        double sum = 0;
//
//        for (int i = 1; i <= grades; i++) {
//            System.out.println("Give grade " + i + ": ");
//            double grade = sc.nextDouble();
//            sum += grade;
//        }
//        double average = sum / grades;
//        System.out.println("Average grade: " + average);

        // Task 20

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Give word: ");
//        String word = sc.nextLine();
//
//        System.out.println("Reverse word: ");
//        for (int i = word.length() - 1; i >= 0; i--){
//            System.out.print(word.charAt(i));
//        }
    }
}
