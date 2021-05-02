
//5. Write a program to check the given number is prime or not?
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter a number you fnd out a prime");
        Scanner sc = new Scanner(System.in);
        int givenNumber = sc.nextInt();
        int primeChecker = 0;
        if( givenNumber == 0 || givenNumber == 1){
                primeChecker = primeChecker + 1;
                   }else {
            for (int i = 2; i <= givenNumber / 2; i++) {
                if (givenNumber % i == 0) {
                    primeChecker = primeChecker + 1;
                }
            }
        }
        if (primeChecker == 0) {
        System.out.println(givenNumber + "This is prime number");
        }
        else {
            System.out.println(givenNumber +"This is not prime number");
        }
    }
}
