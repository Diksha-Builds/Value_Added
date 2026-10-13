''' Count all digits in a number '''

class Solution:
    def digitCounts(self, int) -> int:
        digit = 0
        count = 0

        while(n != 0):
            digit = n % 10
            count += 1
            n = n // 10

        return count