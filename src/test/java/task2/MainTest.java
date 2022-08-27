package task2;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testCountingSortWithArrayExample() {
        int[] originArray = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        int[] rightSortedArray = new int[]{1, 2, 3, 4, 5, 5, 6, 9};
        Assert.assertArrayEquals("result must be {1, 2, 3, 4, 5, 5, 6, 9}", rightSortedArray, Main.countingSort(originArray));
    }

    @Test
    public void testCountingSortWithAllDuplicate() {
        int[] originArray = new int[]{11, 5, 6, 3, 3, 5, 6, 6, 5, 3, 11, 11};
        int[] rightSortedArray = new int[]{3, 3, 3, 5, 5, 5, 6, 6, 6, 11, 11, 11};
        Assert.assertArrayEquals("result must be {3, 3, 3, 5, 5, 5, 6, 6, 6, 11, 11, 11}", rightSortedArray, Main.countingSort(originArray));
    }

    @Test
    public void testCountingSortWithDecreaseSortedArray() {
        int[] originArray = new int[]{100, 44, 35, 27, 22, 10, 1};
        int[] rightSortedArray = new int[]{1, 10, 22, 27, 35, 44, 100};
        Assert.assertArrayEquals("result must be {1, 10, 22, 27, 35, 44, 100}", rightSortedArray, Main.countingSort(originArray));
    }
}
