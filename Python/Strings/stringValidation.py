str = input()
isAlpha = isAlnum = isDigit = isLower = isUpper = False
for c in str:
    if isAlpha == False and c.isalpha():
        isAlpha = True
    if isAlnum == False and c.isalnum():
        isAlnum = True
    if isDigit == False and c.isdigit():
        isDigit = True
    if isLower == False and c.islower():
        isLower = True
    if isUpper == False and c.isupper():
        isUpper = True
        
print(isAlnum)
print(isAlpha)
print(isDigit)
print(isLower)
print(isUpper)

#Smaller compact solution
print(any(c.isalnum() for c in str))
print(any(c.isalpha() for c in str))
print(any(c.isdigit() for c in str))
print(any(c.islower() for c in str))
print(any(c.isupper() for c in str))
