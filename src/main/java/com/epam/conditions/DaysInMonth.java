package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (month <= 0 || month > 12) {
            System.err.println("invalid date");
            return;
        }
        switch (month) {
            case 1:
                System.err.println("31");
                break;
            case 2:
                if (year % 100 == 0 && year % 400 == 0)
                    System.err.println("29");
                else if (year % 4 == 0 && year % 100 > 0)
                    System.err.println("29");
                else if (year % 100 == 0)
                    System.err.println("28");
                else
                    System.err.println("28");
                break;
            case 3:
                System.err.println("31");
                break;
            case 4:
                System.err.println("30");
                break;
            case 5:
                System.err.println("31");
                break;
            case 6:
                System.err.println("30");
                break;
            case 7:
                System.err.println("31");
                break;
            case 8:
                System.err.println("31");
                break;
            case 9:
                System.err.println("30");
                break;
            case 10:
                System.err.println("31");
                break;
            case 11:
                System.err.println("30");
                break;
            case 12:
                System.err.println("31");
                break;
            default:
                System.err.println("Error");
                break;
        }

    }
}
