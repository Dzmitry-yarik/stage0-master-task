package com.epam.langSyntax;

public class NumberReverter {
  
    public void revert(int number) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
