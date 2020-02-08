package string.functional;

public class OnlyDigits {
    public static boolean containsOnlyDigits(String str){

        return !str.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }

    public static boolean containsOnlyDigitsMatches(String str) {

        return str.matches("[0-9]+");
    }

    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("1234"));
        System.out.println(containsOnlyDigits("r34"));
    }
}
