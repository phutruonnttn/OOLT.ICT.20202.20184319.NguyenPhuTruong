/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

import java.util.Scanner;

/**
 *
 * @author truongnguyen
 */
public class Ex6_4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int month = -1, day = -1, year = -1;
        do {
            System.out.print("Enter month: ");
            String m = keyboard.nextLine();

            if ("January".equals(m) || "Jan.".equals(m) || "Jan".equals(m) || "1".equals(m)) {
                month = 1;
                day = 31;
            } else if ("February".equals(m) || "Feb.".equals(m) || "Feb".equals(m) || "2".equals(m)) {
                month = 2;
                day = 28;
            } else if ("March".equals(m) || "Mar.".equals(m) || "Mar".equals(m) || "3".equals(m)) {
                month = 3;
                day = 31;
            } else if ("April".equals(m) || "Apr.".equals(m) || "Apr".equals(m) || "4".equals(m)) {
                month = 4;
                day = 30;
            } else if ("May".equals(m) || "5".equals(m)) {
                month = 5;
                day = 31;
            } else if ("June".equals(m) || "Jun".equals(m) || "6".equals(m)) {
                month = 6;
                day = 30;
            } else if ("July".equals(m) || "Jul".equals(m) || "7".equals(m)) {
                month = 7;
                day = 31;
            } else if ("August".equals(m) || "Aug.".equals(m) || "Aug".equals(m) || "8".equals(m)) {
                month = 8;
                day = 31;
            } else if ("September".equals(m) || "Sept.".equals(m) || "Sep".equals(m) || "9".equals(m)) {
                month = 9;
                day = 30;
            } else if ("October".equals(m) || "Oct.".equals(m) || "Oct".equals(m) || "10".equals(m)) {
                month = 10;
                day = 31;
            } else if ("November".equals(m) || "Nov.".equals(m) || "Nov".equals(m) || "11".equals(m)) {
                month = 11;
                day = 30;
            } else if ("December".equals(m) || "Dec.".equals(m) || "Dec".equals(m) || "12".equals(m)) {
                month = 12;
                day = 31;
            } else {
                System.err.println("It's an invalid month. Please enter again!");
            }
        } while (month == -1);

        do {
            System.out.print("Enter year: ");
            String m = keyboard.nextLine();
            try {
                year = Integer.parseInt(m);
            } catch (Exception err) {
                System.err.println("It's an invalid year. Please enter again!");
            }
            if (year < 0) {
                System.err.println("It's an invalid year. Please enter again!");
            }
        } while (year < 0);

        if (month == 2) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                day = 29;
            }
        }
        System.out.println("The number of days of " + month + "/" + year + " is " + day + " days.");
    }
}
