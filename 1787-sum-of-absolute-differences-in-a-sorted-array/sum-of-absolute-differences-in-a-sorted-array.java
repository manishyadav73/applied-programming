class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int pre = 0;
        int len = nums.length;
        int[] res = new int[len];

        int suf = 0;
        for(int n: nums){
            suf += n;
        }

        for(int i = 0; i < len; i++){
            res[i] = (i*nums[i] - pre) + (suf - (len- i)*nums[i]);
            pre += nums[i];
            suf -= nums[i];
        }

        return res;
    }
}