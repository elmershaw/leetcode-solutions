public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        if (A.length <= 2)
            return true;
        int i = 1;
        while (A.length > i){
            if ( A[i] - A[i-1] > 0 ){
                for (; A.length > i; i++){
                    if (A[i] - A[i - 1] < 0)
                        return false;
                }
            }
            else if ( A[i] - A[i-1] < 0 ){
                for (; A.length > i; i++){
                    if (A[i] - A[i - 1] > 0)
                        return false;
                }
            }
            i++;
        }

        return true;
    }
}
