import java.math.*;

public class NumbersAtMostNGivenDigitSet {
    public int atMostNGivenDigitSet(String[] D, int N) {
        int digitOfN = (""+N).length();
        int sum = 0;
        if (digitOfN == 1){
            for (int j = 0; j < D.length; j++){
                if (Integer.parseInt(D[j]) <= N)
                    sum++;
            }
        }
        else{
            for (int i = digitOfN - 1; i > 0; i--){
                sum += Math.pow(D.length, i);
            }
            sum += comparison(D, N);
        }
        return sum;

    }

    public int comparison(String[] D, int N){
        int digitOfN = (""+N).length();
        int mainNumber = N / (int)(Math.pow(10,digitOfN - 1));
        int count = 0;
        int sum = 0;
        if (digitOfN == 1){
            for (int j = 0; j < D.length; j++){
                if (Integer.parseInt(D[j]) <= N)
                    sum ++;
            }
            return sum;
        }
        for (int i = 0; i < D.length; i++){
            if (Integer.parseInt(D[i]) < mainNumber)
                count++;
            if (Integer.parseInt(D[i]) == mainNumber && (""+ (N % (int)(Math.pow(10,digitOfN - 1)))).length() == digitOfN - 1){
                sum += comparison(D, N % (int)(Math.pow(10,digitOfN - 1)));
            }
        }
        sum += count * Math.pow(D.length, digitOfN - 1);
        return sum;
    }

}
