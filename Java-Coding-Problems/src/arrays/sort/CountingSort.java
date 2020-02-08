package arrays.sort;
//https://learning.oreilly.com/library/view/java-coding-problems/9781789801415/assets/570e8015-a037-48d9-b4f9-459a694b73ee.png
public class CountingSort {
    public static void countingSort(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] counts = new int[max - min + 1];

        for (int i = 0; i < arr.length; i++) {
            counts[arr[i] - min]++;
        }

        int sortedIndex = 0;

        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                arr[sortedIndex++] = i + min;
                counts[i]--;
            }
        }
    }
}
