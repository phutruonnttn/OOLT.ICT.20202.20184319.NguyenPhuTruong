package Lab01;

import java.util.Scanner;

public class Ex2_2_6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choose;
        do {
            System.out.println("+------------------------ PROGRAM TO SOLVE ------------------------+");
            System.out.println("|   [1]. The first-degree equation with one variable               |");
            System.out.println("+------------------------------------------------------------------+");
            System.out.println("|   [2]. The system of first-degree equations with two variables   |");
            System.out.println("+------------------------------------------------------------------+");
            System.out.println("|   [3]. The second-degree equation with one variable              |");
            System.out.println("+------------------------------------------------------------------+");
            System.out.println("|   [4]. Exit                                                      |");
            System.out.println("+------------------------------------------------------------------+");
            System.out.print("Choose your option: ");
            choose = keyboard.nextInt();
            switch (choose) {
                case 1: {
                    double a = 0, b = 0;
                    System.out.println("\n[1]. Equation ax + b = 0");
                    do {
                        System.out.print("     Enter a: ");
                        a = keyboard.nextDouble();
                        if (a == 0) {
                            System.err.println("     a must not be 0. Enter again!");
                        }
                    } while (a == 0);
                    System.out.print("     Enter b: ");
                    b = keyboard.nextDouble();
                    System.out.println("     => x = " + (-b / a) + "\n");
                    break;
                }
                case 2: {
                    double a1 = 0, a2 = 0, b1 = 0, b2 = 0, c1 = 0, c2 = 0;
                    System.out.println("\n[2]. System of equations a1x + b1y = c1");
                    System.out.println("                         a2x + b2y = c2");
                    System.out.print("     Enter a1: ");
                    a1 = keyboard.nextDouble();
                    System.out.print("     Enter b1: ");
                    b1 = keyboard.nextDouble();
                    System.out.print("     Enter c1: ");
                    c1 = keyboard.nextDouble();
                    System.out.print("     Enter a2: ");
                    a2 = keyboard.nextDouble();
                    System.out.print("     Enter b2: ");
                    b2 = keyboard.nextDouble();
                    System.out.print("     Enter c2: ");
                    c2 = keyboard.nextDouble();
                    double D = a1 * b2 - a2 * b1;
                    double Dx = c1 * b2 - c2 * b1;
                    double Dy = a1 * c2 - a2 * c1;
                    if (D == 0) {
                        if (Dx == Dy && Dx == D) {
                            System.out.println("     => The system has many solutions !");
                        } else if (Dx != 0 || Dy != 0) {
                            System.out.println("     => The system has no solutions !");
                        }
                    } else {
                        double x = Dx / D;
                        double y = Dy / D;
                        System.out.println("     => (x, y) = (" + x + ", " + y + ")");
                    }
                    System.out.println("");
                    break;
                }
                case 3: {
                    double a = 0, b = 0, c = 0;
                    System.out.println("\n[3]. Equation ax^2 + bx + c = 0");
                    do {
                        System.out.print("     Enter a: ");
                        a = keyboard.nextDouble();
                        if (a == 0) {
                            System.err.println("     a must not be 0. Enter again!");
                        }
                    } while (a == 0);
                    System.out.print("     Enter b: ");
                    b = keyboard.nextDouble();
                    System.out.print("     Enter c: ");
                    c = keyboard.nextDouble();
                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        System.out.println("     => The equation has no solutions !");
                    } else if (delta == 0) {
                        System.out.println("     => x1 = x2 = " + -b / (2 * a));
                    } else {
                        System.out.println("     => The equation has 2 distinct solutions: ");
                        System.out.println("          x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
                        System.out.println("          x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
                    }
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid. Choose again!\n");
                }
            }
        } while (choose != 4);
    }
}
