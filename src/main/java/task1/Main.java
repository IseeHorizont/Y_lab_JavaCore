package task1;

/*
    1. Заполните двумерный массив случайным числами и выведите
    максимальное, минимальное и среднее значение.
 */

public class Main {

    public static int seed = 1;

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getNextRandomNumber();
            }
        }
        print2dArray(array);
        findMinAndMaxAndAverageValueOfArray(array);
    }

    public static int getNextRandomNumber() {
        int a = 150;
        int c = 119;
        int m = 113;
        seed = (a * seed + c) % m;
        return seed;
    }

    /*
    Поиск мин, макс и сред.зн. выполнен в одном методе, чтобы один раз
    пройти по массиву в двойном цикле, вместо трёх таких проходов
     */
    public static void findMinAndMaxAndAverageValueOfArray(int[][] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                min = array[i][j] < min ? array[i][j] : min;
                max = array[i][j] > max ? array[i][j] : max;
                arraySum += array[i][j];
            }
        }
        System.out.println("Min value of array: " +  min);
        System.out.println("Max value of array: " + max);
        System.out.println("Average value of array: " + (arraySum / (array.length * array[0].length)));
    }

    public static void print2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
