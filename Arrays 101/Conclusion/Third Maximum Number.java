class Solution {
    public int thirdMax(int[] nums) {

        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return nums[0] > nums[1] ? nums[0] : nums[1];

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        boolean min_val_present = false;

        for(int num : nums)
        {
            if(!min_val_present && num == Integer.MIN_VALUE)
                min_val_present = true;

            if(num > first)
            {
                third = second;
                second = first;
                first = num;
            } 
            else if (num > second && num < first)
            {
                third = second;
                second = num;
            }
            else if (num > third && num < second)
            {
                third = num;
            }
        }

        if(min_val_present)
        {
            if(second == Integer.MIN_VALUE)
                return first;
            else
                return third;
        }
        else
        {
            if(third == Integer.MIN_VALUE)
                return first;
            else
                return third;
        }
    }
}
