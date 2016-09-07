from itertools import combinations_with_replacement
inp = input().split()
val = sorted(inp[0])
r = int(inp[1])
L = combinations_with_replacement(val,r)
for i in L:
    print(''.join(i))
