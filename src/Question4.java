import java.util.Scanner;

//4. Write a program to Swap two numbers without using third variable?
public class Question4 {
    public static void main(String[] args) {
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber = sc.nextInt();
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("First Number after Swapping is " +firstNumber);
        System.out.println("Second Number after Swapping is " +secondNumber);


    }
}
