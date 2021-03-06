/** Week 5, Assignment 5
 * Program 5.1 - KG to Pound Conversion
 * by Caleb Hatch
 */

package com.company;


import java.math.BigDecimal;
import java.math.MathContext;

public class Main {

        public static void main(String[] args) {

            int[] ar = {1, 3, 5, 7, 9, 11, 13, 15};
            int i, kg;
            double lb;

            // Prints header format for table
            System.out.printf("%-10s %10s", "Kilograms", "Pounds\n"); // Print header format for table

            System.out.println("---------     ------\s");

            for (i = 0; i < ar.length; i++) {
                kg = ar[i];
                lb = (ar[i] * 2.2);

                BigDecimal bd = new BigDecimal(lb);
                bd = bd.round(new MathContext(3)); // Round pounds to tenths place
                double lbRounded = bd.doubleValue();


                System.out.printf("%-10s", kg);
                System.out.printf("%10s\n", lbRounded);
            }
        }
    }

