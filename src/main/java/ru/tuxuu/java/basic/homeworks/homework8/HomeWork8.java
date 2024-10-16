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
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas.length != 4 || mas[i].length != 4) {
                    System.out.println("Текущая длина массива " + mas.length + " на " + mas[i].length);
                    throw new AppArraySizeException("Размер данного массива не 4х4 !");
                }
            }
        }
        System.out.println("Передан корректный массив 4х4!");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                try {
                    Integer.parseInt(mas[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ячейка " + i + "-" + j + " содержит слово " + mas[i][j]);
                }
                sum += Integer.parseInt(mas[i][j]);
            }
        }
        System.out.println("Сумма всех преобразованных элементов массива " + sum);
    }
}

