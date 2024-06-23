class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length > 1)
        {
            int maxIndex = 0;
            for(int i = 0; i < arr.length - 1; i++)
            {
                if(i < maxIndex)
                {
                    arr[i] = arr[maxIndex];
                }
                else
                {
                    maxIndex = i + 1;
                    for(int j = maxIndex; j < arr.length; j++)
                    {
                        if(arr[j] > arr[maxIndex])
                        {
                            maxIndex = j;
                        }
                    }
                    arr[i] = arr[maxIndex];
                }
            }
        }
        
        arr[arr.length - 1] = -1;
        return arr;
    }
}
