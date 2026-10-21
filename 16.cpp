#include<iostream>
#include<vector>
using namespace std;

class Solution
{
    public:
        int sumOfArrayElements(int n, vector<int> &arr)
        {
            int sum = 0;

            for(int i = 0; i < n; i++)
            {
                sum = sum + arr[i];
            }

            return sum;
        }
};