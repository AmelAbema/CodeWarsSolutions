package SixKyu;

import java.util.HashSet;

public class Counting_Duplicates {
    public static int duplicateCount(String text) {
        HashSet<Character> seenChars = new HashSet<>();
        HashSet<Character> duplicateChars = new HashSet<>();
        for (char c : text.toLowerCase().trim().toCharArray()) {
            if (!seenChars.add(c)) duplicateChars.add(c);
        }
        return duplicateChars.size();
    }
}