n = int(input())
s = set(map(int, input().split())) 
for _ in range(int(input())):
    l = input().split()
    if "pop" == l[0]:
        s.pop()
    elif "remove" == l[0]:
        s.remove(int(l[1]))
    else:
        s.discard(int(l[1]))

print(sum(s))
