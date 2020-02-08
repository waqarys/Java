package arrays.search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

// Problem: 100
public class ArraySearch {

    public static boolean containsElement(int[] arr, int toContain) {
        return Arrays.stream(arr)
                .anyMatch(e -> e == toContain);
    }

    public static <T> int findIndexOfElementObject(T[] arr, T toFind, Comparator<? super T> c) {
        return IntStream.range(0, arr.length)
                .filter(i -> c.compare(toFind, arr[i]) == 0)
                .findFirst()
                .orElse(-1);
    }
}
