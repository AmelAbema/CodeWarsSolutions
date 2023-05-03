package SevenKyu;

public class Vowel_Count {
    public static int getCount(String str) {
        int count = 0;
        char[] chars = str.trim().toLowerCase().toCharArray();
        for (char ch : chars){
            switch (ch){
                case 'a', 'e', 'i', 'o', 'u' -> ++count;
            }
        }
        return count;
    }
}
