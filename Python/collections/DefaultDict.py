from collections import defaultdict
myDict = defaultdict(list)
n,m = [int(i) for i in input().split()]
for i in range(n):
    myDict[input()].append(i+1)

for i in range(m):
    myList = myDict[input()]
    for x in myList:
        print(x, end= " ")
    if (len(myList) < 1):
        print(-1)
    else:
        print()