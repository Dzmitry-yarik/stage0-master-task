package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {
    public static void main(String[] args) {

        int[] arr = {5, -3, 4, -4, 4, 3};
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        int[][] array = {{1, -4, 6}, {2, -4}};

        seasonsArray();
//        for (String element: seasonsArray()) {
//            System.out.println(element);
//        }
        System.out.println("*************************************************************");

        generateNumbers();
//        for (int element: generateNumbers()) {
//            System.out.println(element);
//        }
        System.out.println("*************************************************************");

        totalSum(arr);
        System.out.println("*************************************************************");

        System.out.println(findIndexOfNumber(arr, -13));
        System.out.println("*************************************************************");

        reverseArray();
//        for (String element: reverseArray()) {
//            System.out.print(element + " ");
//        }
        System.out.println("*************************************************************");

//        getOnlyPositiveNumbers();
        for (int element: getOnlyPositiveNumbers()) {
            System.out.println(element + " ");
        }
        System.out.println("*************************************************************");

//        sortRaggedArray(array);
        for (int i = 0; i < sortRaggedArray(array).length; i++) {
            int [] ints = sortRaggedArray(array)[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(sortRaggedArray(array)[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }

    public static String[] seasonsArray() {
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
        return seasons;
    }

    public static int[] generateNumbers() {
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            System.out.print(num[i] + " ");
        }
        System.out.println();
        return num;
    }

    public static int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println("Sum = " +sum);
        return sum;
    }

    public static int findIndexOfNumber(int[] arr, int number) {
        int b = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                b = i;
                return b;
            }
        }
        return b;
    }

    public static String[] reverseArray(){
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        int a = 0;
        String[] newSeasons = new String[seasons.length];
        for (int i = seasons.length-1; 0 <= i; i--) {
            System.out.println(seasons[i] + " ");
            newSeasons[a]  = seasons[i];
            a++;
        }
        return newSeasons;
    }

    public static int[] getOnlyPositiveNumbers() {
        int[] arr = {-5, 2, 0};
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

    public static int[][] sortRaggedArray(int[][] array) {
        int[] arr1 = array[0];
        int[] arr2 = array[1];
        for (int i = 0; i < arr1.length - 1; i++) {
            for(int j = 0; j < arr1.length - i - 1; j++) {
                if(arr1[j + 1] < arr1[j]) {
                    int swap = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = swap;
                }
            }
        }
        for (int i = 0; i < arr2.length - 1; i++) {
            for(int j = 0; j < arr2.length - i - 1; j++) {
                if(arr2[j + 1] < arr2[j]) {
                    int swap = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = swap;
                }
            }
        }
        int[][] arrayNew= {arr1,arr2};
        if (arr1.length > arr2.length){
            int[] tmp = arrayNew[1];
            arrayNew[1]=arrayNew[0];
            arrayNew[0]=tmp;
        }
        return arrayNew;
    }
}
