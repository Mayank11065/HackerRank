from itertools import groupby
inp = input()
L = groupby(inp)
for k,g in L:
    print("(%d, %s)" % (len(list(g)), k), end = ' ')
