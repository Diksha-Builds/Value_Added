// Check if the array is sorted

class Solution
{
    public boolean isArraySorted(int []arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }

        return true;
    }
};