from itertools import combinations
input()
L = [x for x in input().split()]
k = int(input())
P = combinations(L,k)
count=0
len =0
for val in list(P):
    len+=1
    if 'a' in val:
        count+=1

print(count)
print(len)
print("%.3f" % (count/len))