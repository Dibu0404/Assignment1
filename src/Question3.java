//3. Write a java program to swap two variables?

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber = sc.nextInt();
        int thirdNumber ;
        thirdNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        System.out.println("First Number after Swapping is " +firstNumber);
        System.out.println("Second Number after Swapping is " +secondNumber);

    }
}
