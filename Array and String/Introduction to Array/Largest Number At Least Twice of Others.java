class Solution {
    public int dominantIndex(int[] nums) {
        int idxLargest = -1;
        int idxSecondLargest = -1;
        for(int index = 0; index < nums.length; index++)
        {
            if(idxSecondLargest == -1 || nums[index] > nums[idxSecondLargest])
            {
                int idxValue = index;
                if(idxLargest == -1 || nums[idxValue] > nums[idxLargest])
                {
                    int temp = idxLargest;
                    idxLargest = idxValue;
                    idxValue = temp;
                }
                idxSecondLargest = idxValue;
            }
        }
        
        if(nums[idxLargest] < (nums[idxSecondLargest] + nums[idxSecondLargest]))
        {
            return -1;
        }
        return idxLargest;
    }
}
