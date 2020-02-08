package string.functional;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseLettersAndWords {
    private static final Pattern PATTERN = Pattern.compile(" +");

    public static String reverseWords(String str) {
        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String reverseString(String string){
        //return new StringBuilder(reverseWords(string)).reverse().toString();
        return new StringBuilder(string).reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(ReverseLettersAndWords.reverseWords("I am testing the reverse method"));
        System.out.println("Reversed String: "+reverseString("I am testing the reverse string"));
    }
}
