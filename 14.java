// LCM of two numbers

class Solution
{
    public int findLCM(int n1, int n2)
    {
        int rem = 0;
        int product = 0;
        int lcm = 0;

        product = n1 * n2;

        while(n2 != 0) 
        {
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        lcm = product / n1;

        return lcm;
    }
}