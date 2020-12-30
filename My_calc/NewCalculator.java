package com.company;

import java.util.Scanner;

public class NewCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] nums = line.split("[*+/-]");

        char value = line.charAt(nums[0].length());

        execute(nums, value);
    }

    private static void execute(String[] nums, char value) {
        int num1, num2;
        boolean isArabian = true;

        try {
            num1 = Integer.parseInt(nums[0]);
        } catch (Exception e) {
            num1 = RomanNumeral.convertRomanToInt(nums[0]);
            isArabian = false;
        }

        try {
            num2 = Integer.parseInt(nums[1]);
        } catch (Exception e) {
            num2 = RomanNumeral.convertRomanToInt(nums[1]);
            isArabian = false;
        }

        int result = 0;

        switch (value) {
            case 42 :
                result = num1 * num2;
                break;
            case 43 :
                result = num1 + num2;
                break;
            case 45 :
                result = num1 - num2;
                break;
            case 47 :
                result = num1 / num2;
                break;
        }

        if (!isArabian) {
            System.out.println("Результат: " + RomanNumeral.convertIntegerToRoman(result));
        } else {
            System.out.println(result);
        }
    }
}
