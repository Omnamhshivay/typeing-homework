package programmes;

import java.util.Scanner;

//write a java programme to input any year like (ex 2007)and fing out if it is
//leao year or not?
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
        scanner.close();

    }

    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("this year " + year + " is leap year");

        } else {
            System.out.println("this year " + year + " is not leap year");
        }

    }
}
