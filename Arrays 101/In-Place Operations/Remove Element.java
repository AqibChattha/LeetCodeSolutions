class Solution {
    public int removeElement(int[] nums, int val) {
        int writePointer = 0;
        for(int readPointer = 0; readPointer < nums.length; readPointer++)
        {
            if(nums[readPointer] != val)
            {
                if(readPointer != writePointer)
                    nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        return writePointer;
    }
}
