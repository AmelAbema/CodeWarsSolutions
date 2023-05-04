package SixKyu;

public class Your_Order_Please {
    public static String order(String words) {
        if (words.isEmpty()) return words;
        String[] arr = words.split(" ");
        String[] res = new String[arr.length];
        for (String s : arr){
            for (int i = 0; i < s.length(); i++){
                switch (s.charAt(i)){
                    case '1' -> res[0] = s;
                    case '2' -> res[1] = s;
                    case '3' -> res[2] = s;
                    case '4' -> res[3] = s;
                    case '5' -> res[4] = s;
                    case '6' -> res[5] = s;
                    case '7' -> res[6] = s;
                    case '8' -> res[7] = s;
                    case '9' -> res[8] = s;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < res.length; i++){
            result.append(res[i]);
            if (i != res.length - 1) result.append(" ");
        }
        return result.toString();
    }
}
