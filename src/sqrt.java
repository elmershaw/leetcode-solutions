package src;

public class sqrt {
    public static int mySqrt(int x) {
        int i = x;
        int j = 0;
        while (i > 1) {
            j = i;
            i = i >> 1;
            if (i * i <= x) {
                while (i <= j) {
                    int m = (j - i) >> 1 + i;
                    if (m * m == x)
                        return m;
                    if (m * m > x) {
                        j = m - 1;
                    } else {
                        i = m + 1;
                    }
                }
                break;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        mySqrt(4);
    }
}
