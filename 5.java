// Return the largest digit in a number 

class Solution{
    public int returnLargestDigit(int n)
    {
        int digit = 0;
        int max = 0;

        while(n != 0) 
        {
            digit = n % 10;
            if(digit > max)
            {
                max = digit;
            }
            n = n / 10;
        }

        return max;
    }
}