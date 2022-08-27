package task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    2. Отсортируйте массив [5,6,3,2,5,1,4,9],
        написать простые тесты,
        учесть дубликаты в массиве
 */
public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        int[] arrayWithOtherDuplicate = new int[]{1, 6, 3, 2, 5, 1, 4, 9, 10, 9};
        int[] arrayWithOnlyDuplicate = new int[]{3, 15, 15, 3, 1, 15, 1, 1, 15};

        printArray(countingSort(array));
        printArray(countingSort(arrayWithOtherDuplicate));
        printArray(countingSort(arrayWithOnlyDuplicate));
    }

    public static int[] countingSort(int[] array) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            minValue = array[i] < minValue ? array[i] : minValue;
            maxValue = array[i] > maxValue ? array[i] : maxValue;
            counter.put(array[i], counter.getOrDefault(array[i], 0) + 1);
        }

        int[] sortedArray = new int[array.length];
        Arrays.fill(sortedArray, 0);
        int pointer = 0;
        for (int i = minValue; i <= maxValue; i++) {
            if (counter.containsKey(i)) {
                int n = counter.get(i);
                while (n > 0) {
                    sortedArray[pointer] = i;
                    n--;
                    pointer++;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
