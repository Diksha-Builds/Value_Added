// Check whether a number is an armstrong number or not

class Solution{
    public boolean isArmstrong(int n)
    {
        int original = n;
        int arm = 0;
        int digit = 0;
        int count = 0;

        while(n != 0) 
        {
            count++;
            n = n / 10;
        }

        n = original;

        while(n != 0) 
        {
            digit = n % 10;
            arm += (int) Math.pow(digit, count);
            n = n / 10;
        }

        if(arm == original)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}