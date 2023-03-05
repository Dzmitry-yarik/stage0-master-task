package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {
    
    public String[] seasonsArray() {
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 0; i < seasons.length; i++) {
            System.err.println(seasons[i]);
        }
        return seasons;
    }

    public int[] generateNumbers(int a) {
        int[] num = new int[a];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            System.err.print(num[i] + " ");
        }
        System.err.println();
        return num;
    }

    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.err.println("Sum = " + sum);
        return sum;
    }

    public int findIndexOfNumber(int[] arr, int number) {
        int b = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                b = i;
                return b;
            }
        }
        return b;
    }

    public String[] reverseArray(String[] seasons) {
        int a = 0;
        String[] newSeasons = new String[seasons.length];
        for (int i = seasons.length - 1; 0 <= i; i--) {
            System.err.println(seasons[i] + " ");
            newSeasons[a] = seasons[i];
            a++;
        }
        return newSeasons;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                a++;
            }
        }
        int[] newArr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[b] = arr[i];
                b++;
            }
        }
        return newArr;
    }

}

