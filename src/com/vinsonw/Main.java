package com.vinsonw;

import java.awt.*;
import java.util.Date;

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
        Point point1 = new Point(1, 1);
        Point point2 = point1; // point2 and point1 point to the same object
        point1.x = 2; // use point1 as the handler to update the same object, DIFFER FROM PYTHON.
        System.out.println(point2);

        // test git from idea.

    }
}
