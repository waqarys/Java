package string.functional;

import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateChars {
    public Map<String, Long> countDuplicateCharacters(String str){
        //return str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return str.codePoints().mapToObj(c -> String.valueOf(Character.toChars(c))).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
