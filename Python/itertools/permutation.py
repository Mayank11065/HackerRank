from itertools import permutations
val,r = [x for x in input().split()]
r = int(r)
L = sorted(val)
res = list(permutations(L,r))
for i in res:
    print(''.join(i))