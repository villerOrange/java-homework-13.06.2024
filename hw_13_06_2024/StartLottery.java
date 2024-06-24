package org.example.hw_13_06_2024;

public class StartLottery {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int countUser = Utils.getCountUsers();  // Пользователь вводит число от 1 до 3
        int[] winNum = Utils.getLuckyNumbers();
        int[][] humNum = new int[countUser][Constant.COUNT_SET_SIZE];
        for (int i = 0; i < countUser; i++) {
            humNum[i] = Utils.getUserNumbers();  // Заполнение номеров для каждого пользователя
        }
        for (int i = 0; i < countUser; i++) {
            lottery.runLottery(winNum, humNum[i]);  // Выполнение лотереи для каждого пользователя
        }
    }
}
