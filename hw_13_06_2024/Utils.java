package org.example.hw_13_06_2024;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getLuckyNumbers() {
        int[] luckyNumbers = new int[Constant.COUNT_SET_SIZE];
        Random random = new Random();
        int currentRandomValue = 0;
        int i = 0;
        while (i < luckyNumbers.length) {
            currentRandomValue = random.nextInt(1, 51);
            if (!checkDuplicates(luckyNumbers, currentRandomValue)) {
                luckyNumbers[i] = currentRandomValue;
                i++;
            }
        }
        return luckyNumbers;
    }

    public static int[] getUserNumbers() {
        int[] humanNums = new int[Constant.COUNT_SET_SIZE];
        System.out.println("Введите 5 чисел от 1 до 50");
        int i = 1;
        while (i <= humanNums.length) {
            System.out.print("Введите число #" + i + ": ");
            int humanNumPre = scanner.nextInt();
            if (humanNumPre >= 1 && humanNumPre <= 50 && !checkDuplicates(humanNums, humanNumPre)) {
                humanNums[i - 1] = humanNumPre;
                i++;
            } else {
                System.out.println("Число вне диапазона 1-50 или такое число уже было введено");
            }
        }
        return humanNums;
    }

    private static boolean checkDuplicates(int[] luckyNumbers, int currentNum) {
        for (int i = 0; i < luckyNumbers.length; i++) {
            if (luckyNumbers[i] == currentNum) {
                return true;
            }
        }
        return false;
    }

    public static int compOfNumbers(int[] luckyNumbers, int[] humanNumbers) {
        int matchingNum = 0;
        for (int humNum : humanNumbers) {
            for (int luckNum : luckyNumbers) {
                if (humNum == luckNum) {
                    matchingNum++;
                    break;
                }
            }
        }
        return matchingNum;
    }

    //    public static int compOfNumbers(int[] luckyNumbers, int[] humanNumbers) {
//        int matchingNum = 0;
//        Arrays.sort(luckyNumbers);
//        Arrays.sort(humanNumbers);
//        for (int i = 0; i < Constant.COUNT_SET_SIZE; i++) {
//            if (luckyNumbers[i] == humanNumbers[i]) {
//                matchingNum++;
//            }
//        }
//        return matchingNum;
//    }
    public static int getCountUsers() {
        int countUsers = 1;
        do {
            System.out.println("Введите количество игроков от 1 до 3: ");
            countUsers = scanner.nextInt();
        }
        while (countUsers < 1 || countUsers > 3);  // Изменено с 7 на 3
        return countUsers;
    }

}