package SixKyu;

public class Highest_Scoring_Word {
    public static String high(String s) {
        String result = "";
        int max = 0;

        for (String word : s.split(" ")) {
            int count = 0;
            for (char c : word.toCharArray()) {
                count += c - 96;
            }
            if (count > max) {
                max = count;
                result = word;
            }
        }
        return result;
    }
}
