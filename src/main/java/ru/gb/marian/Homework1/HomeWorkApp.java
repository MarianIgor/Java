package ru.gb.marian.Homework1;

public class HomeWorkApp {
    public static void printThreeWords() {
        System.out.println
                ("Orange\nBanana\nApple\n");
    }
        public static void checkSumSign() {
            int a = 5, b = -10;
            if (a + b >= 0) {
                System.out.println("Сумма положительная");

            } else {
                System.out.println("Сумма отрицательная");
            }
        }
    public static void printColor() {
        int value=30;
        if (value<=0)
        {
            System.out.println("Красный");
        }
        if (value >0&&value<=100)
        {
            System.out.println("Желтый");
        }if (value>100)
        {

            System.out.println("Зеленый");
    }
    }
    public static void compareNumbers() {
        int a=3,b=-5;
        if (a>=b)
        {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}
