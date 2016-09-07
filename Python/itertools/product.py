import itertools
A = [int(x) for x in input().split()]
B = [int(x) for x in input().split()]

print(" ".join(str(val) for val in list(itertools.product(A,B))))