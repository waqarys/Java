package chapter2;

import java.util.List;
import java.util.Objects;

public class NullReferenceCheck {
    public static int sumIntegers(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            throw new IllegalArgumentException("List cannot be null");
        }

        return integers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static boolean integersContainsNulls(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            return false;
        }

        return integers.stream()
                .anyMatch(Objects::isNull);
    }
}
