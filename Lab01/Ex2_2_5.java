package Lab01;

import java.util.Scanner;

public class Ex2_2_5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int flag;
        double a = 0,b = 0;
        do {
            System.out.print("Enter the first number: ");
            String m = keyboard.nextLine();
            flag = 1;
            try {
                a = Double.parseDouble(m);
            } catch (Exception err) {
                flag = 0;
                System.err.println("It's not a double number. Please enter again!");
            }
        } while (flag == 0);
        do {
            System.out.print("Enter the second number: ");
            String m = keyboard.nextLine();
            flag = 1;
            try {
                b = Double.parseDouble(m);
            } catch (Exception err) {
                flag = 0;
                System.err.println("It's not a double number. Please enter again!");
            }
        } while (flag == 0);
        
        System.out.println("Sum of two numbers is " + (a+b));
        System.out.println("Difference of two numbers is " + (a-b));
        System.out.println("Product of two numbers is " + (a*b));
        System.out.println("Quotient of two numbers is " + (a/b));
    }
}
