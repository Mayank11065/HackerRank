A = set(map(int, input().split()))
k = int(input())
res = True
for _ in range(k):
    B = set(map(int,input().split()))
    if B < A :
        res = True
    else:
        res = False
        break
print(res)