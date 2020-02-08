package string;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateChars {
    public Map<String, Integer> countDuplicateCharacters(String str) {

        Map<String, Integer> result = new HashMap<>();

        // or use for(char ch: str.toCharArray()) { ... }
        for (int i = 0; i<str.length(); i++) {
            //char ch = str.charAt(i);
            int cp = str.codePointAt(i);
            String ch = String.valueOf(Character.toChars(cp));
            if(Character.charCount(cp) == 2) { // 2 means a surrogate pair
                i++;
            }
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }
}
