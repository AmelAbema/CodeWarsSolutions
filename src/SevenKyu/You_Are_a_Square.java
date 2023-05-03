package SevenKyu;

public class You_Are_a_Square {
    public static boolean isSquare(int n) {
        return n == 0 || n % Math.sqrt(n) == 0;
    }
}
