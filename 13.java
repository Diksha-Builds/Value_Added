// GCD of two numbers

class Solution
{
    public int gcdOfTwoNumbers(int n1, int n2)
    {
        int rem = 0;

        while(n2 != 0) 
        {
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        return n1;
    }
}