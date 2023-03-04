package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10; //Суммируем остаток от деления
            number /= 10; //Отсекаем последнюю цифру

        }
        System.out.println("Сумма всех цифр = " + sum);
    }

}
