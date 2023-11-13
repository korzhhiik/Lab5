package com.main;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;
        boolean pin_code_coincided = false;

        while (true) {
            String correct = sc.nextLine();
            String vasya = sc.nextLine();

            if (correct.equals(vasya)) {
                pin_code_coincided = true;
                System.out.println("CORRECT");
                break;
            } else {
                System.out.println("INCORRECT " + counter);
            }

            counter++;

            if (counter == 5) {
                break;
            }
        }
        if (!pin_code_coincided) {
            System.out.println("Error");
        }
    }
}

