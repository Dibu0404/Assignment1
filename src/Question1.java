import java.util.Scanner;

//1. Write a program to find sum of two numbers?
public class Question1 {
    public static void main(String[] args) {
        int sumOfNumber = 0 ;
        System.out.println("Enter first Number");
        Scanner sc = new Scanner(System.in);
        int numberFirst = sc.nextInt();
        System.out.println("Enter Second Number");
        int numberSecond = sc.nextInt();
        sumOfNumber = numberFirst + numberSecond;
        System.out.println("Sum of two number is " + sumOfNumber);
    }
}
