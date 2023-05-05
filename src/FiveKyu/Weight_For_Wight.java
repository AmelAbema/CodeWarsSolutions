package FiveKyu;

import java.util.*;

public class Weight_For_Wight {
    public static void main(String[] args) {
        System.out.println(orderWeight("56 65 74 100 99 68 86 180 90"));
    }
    public static String orderWeight(String string) {
        List<String> s = Arrays.asList(string.split(" "));
        s.sort((o1, o2) -> {
            int diff = getSum(o1) - getSum(o2);
            return diff == 0 ? o1.compareTo(o2) : diff < 0 ? -1 : 1;
        });
        return String.join(" ", s);
    }

    private static int getSum(String s) {
        int sum = 0;
        for(String d : s.split("")) {
            sum += Integer.parseInt(d);
        }
        return sum;
    }
}
