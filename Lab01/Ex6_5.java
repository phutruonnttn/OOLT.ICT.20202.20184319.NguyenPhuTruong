/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author truongnguyen
 */
public class Ex6_5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of elements of array: ");
        int n = keyboard.nextInt();

        double arr[] = new double[n];
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = keyboard.nextDouble();
        }

        Arrays.sort(arr);
        System.out.println("Sorted numeric array: " + Arrays.toString(arr));

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        double average = sum / n;
        System.out.println("Sum of the array elements is: " + sum);
        System.out.println("Average value of the array elements is: " + average);
    }
}
