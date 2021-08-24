package com.vinsonw;

import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // variables
//        int myAge = 30;
//        int herAge = myAge;
//        System.out.println(herAge);

        // Primitive Types
        // byte, short, int, long, float, double, char, boolean
//        byte age = 30;
//        long viewsCount = 3_123_456_789L; // L is necessary
//        float price = 10.99F; // F is necessary
//        char letter = 'A'; // single quotes for letter; double quotes for string.
//        boolean isEligible = false;

        // Reference Types
//        Date now = new Date(); // 'now' object is an instance of Date class
//        now.getTime();
//        System.out.println(now);

        // different copy behavior between primitive and reference type
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);
//        Point point1 = new Point(1, 1);
//        Point point2 = point1; // point2 and point1 point to the same object
//        point1.x = 2; // use point1 as the handler to update the same object, DIFFER FROM PYTHON.
//        System.out.println(point2);

        // test git from idea.
        // use git config --global --replace-all user.name to reset account info
//

        // String class

//        String Message = new String();
//        String message = " hello \"Mosh\"" + "!!  ";
//        message.endsWith("!");
//        message.length();
//        message.indexOf("H");
//        message.replace("!", "*");
//        message.toUpperCase();

//        System.out.println(message.replace("!", "*"));
//        System.out.println(message.toUpperCase());
//        System.out.println(message.trim());

        // Escape Sequence

//        System.out.println("Hello \"Mosh\"");
//        System.out.println("C:\\Windows\\...\\");
//        System.out.println("hello\nworld");
//        System.out.println("hello\tworld");

        // Arrays

//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[10] = 10;

//        System.out.println(numbers); // only print a string based on array memory address
//        System.out.println(Arrays.toString(numbers)); // print the content of the array
//        int[] numbers1 = {2, 3, 5, 1, 4};
//        System.out.println(numbers1.length);
//        Arrays.sort(numbers1);
//        System.out.println(Arrays.toString(numbers1));

        // Multi-dimensional Arrays

//        int[][] numbers = new int[2][3]; // meaning 2 rows and 3 columns
//        numbers[0][0] = 1;
//        // use .deepToString() to print multi-dimensional array
//        System.out.println(Arrays.deepToString(numbers));
//
//        int[][] numbers1 = {
//                {1, 2, 3},
//                {4, 5, 6}
//        }; // equivalent curly brackets syntax
//        System.out.println(Arrays.deepToString(numbers1));


        // Constants - use keyword "final" to modify type keyword

//        final float PI = 3.14F;
//        PI = 3.1; // get an error.

        // Arithmetic Operators

        // + - * / %
//        int result = 10 / 3;
//        double result = (double) 10 / (double) 3;
        // ++ --
//        int x = 1;
//        x++;
//        x += 2;
//        System.out.println(x);


        // Order of operations

//        () */ +-

        // Casting

        // Implicit cast (automatic casting)
        // byte > short > int
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);

//        double x = 1.1;
//        double y = x + 2; //2.0
//        int y = (int) x + 2;
//        String s = "1";
        // use Integer.parseInt() to
        // convert string to integer
//        int y = Integer.parseInt(s) + 2;
//        String s1 = "1.1";
//        double y = Double.parseDouble(s1) + 1.1;
//        System.out.println(y);


        // the Math class
//    int result = Math.round(1.1F);
//    int result1 = (int) Math.ceil(1.1F);
//    int result2 = (int) Math.floor(1.1F);
//    int result3 = Math.max(1, 2);
//    // generate a random number between 0 and 1
//    double result4 = Math.random();
//    int result5 = (int) Math.round(Math.random() * 100);
//    System.out.println(result5);


        // Formatting Numbers

//        NumberFormat currency = new NumberFormat();
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.1);

        // method chaining (without giving the object a name in the middle)
//        String result = NumberFormat.getCurrencyInstance().format(0.1);
//        System.out.println(result); // print ¥0.10

        // Reading Input from user
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        System.out.print("Name: ");
//        String name = scanner.next().trim();
//
//        System.out.println("You are " + age); //java automatically convert age to a string
//        System.out.println("Your name is: " + name);

        // Exercise: Mortgage Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        double principle = scanner.nextDouble();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat(); // input as percentage number
        System.out.print("Periods(Years): ");
        byte periodYear = scanner.nextByte();

        float monthlyInterestRate = annualInterestRate / 100 / 12;
        int periodMonths = periodYear * 12;
        String Mortgage = NumberFormat.getCurrencyInstance().format(
                principle *
                monthlyInterestRate *
                Math.pow(1+monthlyInterestRate, periodMonths)
                /
                (Math.pow(1+monthlyInterestRate, periodMonths) - 1)
        );
        System.out.println("Your mortgage: " + Mortgage);



    }

}
