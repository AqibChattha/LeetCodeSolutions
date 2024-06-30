class Solution {
    public int[] plusOne(int[] digits) {
        for(int index = digits.length - 1; index > -1; index--)
        {
            if(digits[index] < 9)
            {
                digits[index]++;
                return digits;
            }else if(index == 0)
            {
                int[] plusOne = new int[digits.length + 1];
                plusOne[0]++;
                return plusOne;
            }
            else
            {
                digits[index] = 0;
            }
        }
        return digits;
    }
}
