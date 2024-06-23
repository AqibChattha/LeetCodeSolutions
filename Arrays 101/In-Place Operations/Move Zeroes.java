class Solution {
    public void moveZeroes(int[] nums) {
        
        int writePointer = 0;
        
        for(int readPointer = 0; readPointer < nums.length; readPointer++)
        {
            if(nums[readPointer] != 0)
            {
                if(readPointer != writePointer)
                {
                    nums[writePointer] = nums[readPointer];
                    nums[readPointer] = 0;
                }
                writePointer++;
            }
        }
    }
}
