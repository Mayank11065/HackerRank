input()
M = set(map(int,input().split()))  #One way to populate set from space-seperated input
input()
N = {int(i) for i in input().split(" ")} #Another way to populate set

union = M.union(N)
intersection = M.intersection(N)
sym_diff = union.difference(intersection)
L = sorted(sym_diff)
for i in L:
    print(i)