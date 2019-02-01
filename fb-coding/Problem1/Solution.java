public class Solution {
    public static int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] result = new int[target + 1];
        result[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    result[i] += result[i - num];
                }
            }
        }

        for(int i=1;i<=target;i++){
            System.out.println(i+" -- "+result[i]);
        }

        return result[target];
    }


    public static void main(String args[]){

        int[] x={3};
        int target=4;
        System.out.println(combinationSum4(x,target));

    }
}