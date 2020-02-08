package string;

public class ReverseLettersAndWords {
    private static final String WHITESPACE = " ";

    public String reverseWords(String str) {

        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word: words) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }

            reversedString.append(reverseWord).append(WHITESPACE);
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        ReverseLettersAndWords obj = new ReverseLettersAndWords();
        System.out.println(obj.reverseWords("I am testing the reverse method"));
    }
}
