package com.epam.conditions;

public class TriangleValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
         if ((firstSide + secondSide) > thirdSide &
                 (secondSide + thirdSide) > firstSide & (thirdSide + firstSide) > secondSide) {
             System.out.println("The triangle exist.");
         } else {
             System.out.println("The triangle doesn't exist."); }
    }
}
