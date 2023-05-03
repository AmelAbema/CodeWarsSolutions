package SixKyu;

import java.util.Arrays;

public class Split_Strings {
    public static String[] solution(String s) {
        String[] res = new String[(s.length() + 1) / 2];
        Arrays.fill(res, "");

        int count = 0;
        if (s.length() % 2 == 0) {
            for (int j = 0; j < res.length; j++) {
                res[j] += s.charAt(count);
                count += 1;
                res[j] += s.charAt(count);
                count += 1;
            }

        } else {
            for (int j = 0; j < res.length; j++) {
                res[j] += s.charAt(count);
                count += 1;
                if (count >= s.length() - 1) res[j] += "_";
                else res[j] += s.charAt(count);
                count += 1;
            }
        }
        return res;
    }
}