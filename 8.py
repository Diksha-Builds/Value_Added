''' Celsius to Fahrenheit '''

def celsius_to_fahrenheit(C):
    F = (C * 9/5) + 32

    if F.is_integer():
        return int(F)
    return F