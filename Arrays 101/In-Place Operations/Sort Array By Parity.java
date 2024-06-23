class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int writePointer = 0;
        
        for(int readPointer = 0; readPointer < nums.length; readPointer++)
        {
            if(nums[readPointer] % 2 == 0)
            {
                if(readPointer != writePointer)
                {
                    int temp = nums[writePointer];
                    nums[writePointer] = nums[readPointer];
                    nums[readPointer] = temp;
                }
                writePointer++;
            }
        }
        
        return nums;
    }
}
