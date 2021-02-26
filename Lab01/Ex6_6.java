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
public class Ex6_6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of rows of matrix: ");
        int m = keyboard.nextInt();
        System.out.print("Enter number of columns of matrix: ");
        int n = keyboard.nextInt();

        int mt1[][] = new int[m][n];
        int mt2[][] = new int[m][n];
        int mtSum[][] = new int[m][n];

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mt1[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mt2[i][j] = keyboard.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mtSum[i][j] = mt1[i][j] + mt2[i][j];
            }
        }

        System.out.println("Sum of two matrices:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mtSum[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
