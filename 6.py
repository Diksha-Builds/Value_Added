''' Factorial of a given number '''

def factorial(n):
    fact = 1

    for i in range(n):
        fact = fact * n
        n -= 1

    return fact