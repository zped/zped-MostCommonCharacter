import java.util.HashMap;
import java.util.Map;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> chars = new HashMap<>();
        Integer x;
        for (Character chr : str.toCharArray()){
            x = chars.get(chr);
            if (x != null) {
                chars.put(chr, x+1);
            } else {
                chars.put(chr, 1);
            }
        }
        Character highest = null;
        int count = 0;
        for (Map.Entry candidate : chars.entrySet()){
            if ((int) candidate.getValue() > count) {
                count = (int) candidate.getValue();
                highest = (char) candidate.getKey();
            } 
        }
        return highest;
    }
}
