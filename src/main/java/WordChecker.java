import java.util.Arrays;

public class WordChecker {

    public static Boolean check(String word1, String word2) {
        if (word1 == null || word2 == null) {
            return null;
        }
        if ("".equals(word1) || "".equals(word2)) {
            return false;
        }
        if (word1.length() != word2.length()) {
            return false;
        }
        // we make it uppercase to order it correctly
        word1 = word1.toUpperCase();
        word2 = word2.toUpperCase();


        return order(word1).equals(order(word2));
    }

    public static String order(String str) {
        char[] charArray1 = str.toCharArray();
        Arrays.sort(charArray1);
        return new String(charArray1);
    }
}
