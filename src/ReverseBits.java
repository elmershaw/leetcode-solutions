public class ReverseBits {
        // you need treat n as an unsigned value
    private static final Integer[] CACHE = new Integer[256];

    public int reverseBits(int n) {
        return reverse(n, 0) | reverse(n, 1) | reverse(n, 2) | reverse(n, 3);
    }

    private static int reverse(int n, int s) {
        int slice = getByte(n, s);
        int result = 0;
        if ( CACHE[slice] != null ) {
            result = CACHE[slice].intValue() << ( ( 3 - s ) * 8 );
        } else {
            int reversed = reverseLSByte(slice);
            CACHE[slice] = Integer.valueOf(reversed);
            result = reversed << ( ( 3 - s ) * 8 );
        }
        return result;
    }
    public static int getByte(int n, int s) {
        int mask = 255 << ( s * 8 );
        int b = n & mask;
        int result = b >>> ( s * 8 );
        return result;
    }

    private static int reverseLSByte(int n) {
        int reversed = 0;
        for ( int i = 0; i < 8; i++, n = n >> 1 ) {
            int bit = ( 1 & n );
            reversed = reversed | ( bit << 7 - i );
        }
        return reversed;
    }
}
