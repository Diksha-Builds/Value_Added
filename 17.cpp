// Count of odd numbers in array

#include<iostream>
#include<vector>
using namespace std;

class Solution
{
    public:
        int countOddNumbers(int n, vector<int> &array)
        {
            int iCount = 0;

            for(int i = 0; i < n; i++)
            {
                if(array[i] % 2 != 0)
                {
                    iCount++;
                }
            }

            return iCount;
        }
};