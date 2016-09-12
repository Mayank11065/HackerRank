from collections import Counter
x = int(input())
shoes = [int(i) for i in input().split()]
ctr = Counter(shoes)
sum =0
for _ in range(int(input())):
    size,val = [int(i) for i in input().split()]
    if(ctr[size] > 0):
        sum += val
        ctr[size] -= 1

print(sum)