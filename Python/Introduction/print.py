N = int(input())
#Printing using loop
for i in range(1,N+1):
    print(i,end='')

#Single line print command based on input
print(*range(1, N+1), sep='')
