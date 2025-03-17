package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih test-case (1/2/3): ");
        int selected = scanner.nextInt();
        switch (selected) {
            case 1:
                Case1 case1 = new Case1();
                case1.run();
                break;
            case 2:
                Case2 case2 = new Case2();
                case2.run();
                break;
            case 3:
                Case3Factorial case3Factorial = new Case3Factorial();
                case3Factorial.run();
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }
        scanner.close();
    }
}
