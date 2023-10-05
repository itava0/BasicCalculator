package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Possible calculations:  ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiple");
        System.out.println("(D)ivive");

        System.out.print("Please select an option: ");
        String operationLetter = scanner.next();

        int answer = 0;
        switch (operationLetter) {
            case "A":
                answer += (num1 + num2);
                System.out.println(num1 + " + " + num2 + " = " + answer);
                break;
            case "S":
                answer += (num1 - num2);
                System.out.println(num1 + " - " + num2 + " = " + answer);
                break;
            case "M":
                answer += (num1 * num2);
                System.out.println(num1 + " * " + num2 + " = " + answer);
                break;
            case "D":
                answer += (num1 / num2);
                System.out.println(num1 + " / " + num2 + " = " + answer);
                break;
        }
    }
}
