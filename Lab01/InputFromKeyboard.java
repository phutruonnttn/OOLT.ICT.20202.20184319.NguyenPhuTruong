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
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What's your name?");
        String strName = keyboard.nextLine();
        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("How thall are you (m)?");
        double dHeight = keyboard.nextDouble();
        
        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. Your height is " + dHeight + ".");
    }
}
