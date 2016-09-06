a,b = [int(input()) for x in range(2)]
print(a//b)
print(a%b)
print(divmod(a,b))

#Multiple print in one line:
print(a//b,a%b,divmod(a,b),sep='\n')