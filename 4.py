''' Palindrome number '''

def isPalindrome(n):
    original = n
    digit = 0
    rev = 1

    while(n != 0):
        digit = n % 10
        rev = rev * 10 + digit
        n = n // 10

    if(rev == original):
        return True
    else:
        return False