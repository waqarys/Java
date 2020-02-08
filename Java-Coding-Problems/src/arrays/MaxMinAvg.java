package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

// Problem: 104, 105
public class MaxMinAvg {
    public static void main(String[] args) {
        int[] integers  = {2, 3, 4, 1, -4, 6, 2};

        int maxInt = Arrays.stream(integers).max().getAsInt();

        double avg = Arrays.stream(integers).average().getAsDouble();

        //Reversing an array
        int[] integers1 = {-1, 2, 3, 1, 4, 5, 3, 2, 22};
        int[] reversed = IntStream.rangeClosed(1, integers1.length).map(i -> integers1[integers1.length -i]).toArray();
        Arrays.stream(reversed).forEach(System.out::println);

        /*Melon[] reversed = IntStream.rangeClosed(1, melons.length)
                .mapToObj(i -> melons[melons.length - i])
                .toArray(Melon[]:new);*/
    }
}
