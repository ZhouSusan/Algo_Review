class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    /**
     * Calculating the sum of the elements of nums between indices left and right inclusively.
     * @param left - integer
     * @param right - integer
     * @return sum - the sum of the range
     */
    public int sumRange(int left, int right) {
        if(nums.length == 1) return nums[0];

        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
