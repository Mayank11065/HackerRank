from itertools import combinations
inp = input().split()
val = sorted(inp[0])
r = int(inp[1])
for i in range(1,r+1):
    L = combinations(val,i)
    for i in L:
        print(''.join(i))
