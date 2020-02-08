package string.functional;

import string.Pair;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelsAndConsonants {

    private static final Set<Character> allVowels
            = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Pair<Long, Long> countVowelsAndConsonants(String str) {

        str = str.toLowerCase();

        long vowels = str.chars()
                .filter(c -> allVowels.contains((char) c))
                .count();

        long consonants = str.chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch<= 'z'))
                .count();

        return (Pair<Long, Long>) Pair.of(vowels, consonants);
    }
}
