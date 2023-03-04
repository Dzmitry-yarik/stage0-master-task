package com.epam.conditions;

public class DaysInMonth {
//    public static void main(String []args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter desired year: ");
//        int year = scanner.nextInt();
//        System.out.println("Enter desired month: ");
//        int month = scanner.nextInt();
//    }

    public void printDays(int year, int month) {
        Scanner scn = new Scanner(System.in);
        while (month > 12) {
            System.out.println("Wrong month!!!");
            System.out.println("Enter another month: ");
            month = scn.nextInt();
            if (month < 12) break;
        }
        Calendar myCalendar = (Calendar) Calendar.getInstance().clone();
        myCalendar.set(year, month, 0);
        int max_date = myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Number of days in " + month + " month " + year + " year - " + max_date);
        myCalendar.set(year, 2, 0);
        int leap = myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (leap == 29)
            System.out.println("Leap yea");
        else
            System.out.println("Not a leap yea");
    }
}
