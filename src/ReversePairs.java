public class ReversePairs {
    public static int reversePairs(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] > 2L*nums[j]){
                    sum++;
                }

            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};

        System.out.print(reversePairs(nums));
    }
}
