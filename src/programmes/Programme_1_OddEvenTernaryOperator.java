package programmes;

import java.util.Scanner;

//Write a java program that tells ius that input number is odd or even?
//hint : use ternary operator(?:)
public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        //scanner declaretion for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number");
        int number=scanner.nextInt();
        isItOddOrEvenNumber(number);
        scanner.close();
    }

    public static void isItOddOrEvenNumber(int number) {
            String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
            System.out.println("The " + number + " is " + evenOrOdd + " number");

    }

    {

    }
}
