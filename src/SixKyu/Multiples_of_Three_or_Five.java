package SixKyu;

public class Multiples_of_Three_or_Five {
    public int solution(int number) {
        if (number < 3) return 0;
        int count = 0;
        int i = number - 1;
        while (i < number && i >= 3){
            if (i % 5 == 0 && i % 3 == 0) count += i;
            else if (i % 5 == 0 || i % 3 == 0) count += i;
            i -= 1;
        }
        return count;
    }
}
