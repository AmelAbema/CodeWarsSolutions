package SixKyu;

public class Detect_Pangram {
    public boolean check(String sentence){
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!sentence.toLowerCase().contains(String.valueOf(ch))) {
                return false;
            }
        }
        return true;
    }
}
