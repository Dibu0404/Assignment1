import java.util.Scanner;

//2. Write a program to find given number is odd or even?
public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter a number to find out odd or even");
        Scanner sc = new Scanner(System.in);
        int givenNumber = sc.nextInt();
        if(givenNumber % 2 == 0){
            System.out.println(givenNumber +" This Number is even. ");
        }
        else {
            System.out.println(givenNumber +" This Number is Odd. ");

        }
    }
}
