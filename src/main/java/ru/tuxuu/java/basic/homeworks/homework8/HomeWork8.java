package ru.tuxuu.java.basic.homeworks.homework8;


public class HomeWork8 {
    public static void main(String[] args) {
        String[][] masiv = new String[][]{{"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}};
        String[][] masiv1 = new String[][]{{"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}};
        String[][] masiv2 = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] masiv3 = new String[][]{{"1", "2", "3", "4"}, {"1", "cat", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};


        mas(masiv);
        mas(masiv1);
        mas(masiv2);
        mas(masiv3);


    }

    public static void mas(String[][] mas) {
        int sum = 0;
        if (mas.length != 4) {
            throw new AppArraySizeException("Длина данного массива не 4х4!");
        }
        for (String[] ma : mas) {
            if (ma.length != 4) {
                throw new AppArraySizeException("Ширина данного массива не 4х4!");
            }
        }
        System.out.println("Передан корректный массив 4х4!");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                int value;
                try {
                    value = Integer.parseInt(mas[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ячейка " + i + "-" + j + " содержит слово " + mas[i][j]);
                }
                sum += value;
            }
        }
        System.out.println("Сумма всех преобразованных элементов массива " + sum);
    }
}

