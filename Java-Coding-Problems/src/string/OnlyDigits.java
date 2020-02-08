package string;

public class OnlyDigits {
    public static boolean containsOnlyDigits(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("123r"));
    }
}
