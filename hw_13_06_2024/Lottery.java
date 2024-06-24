package org.example.hw_13_06_2024;

import java.util.Arrays;

public class Lottery {
    public void runLottery(int[] winNum, int[] humNum) {
        int matchingCount = Utils.compOfNumbers(winNum, humNum);
        System.out.println("Выигрышные номера: " + Arrays.toString(winNum));
        System.out.println("Вы ввели номера: " + Arrays.toString(humNum));
        System.out.println("Количество совпадений: " + (matchingCount));
    }

}