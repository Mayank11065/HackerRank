from collections import deque
for i in range(int(input())):
    input()
    cubes = deque(map(int,input().split()))
    prev = cubes[0] if cubes[0] > cubes[-1] else cubes[-1]
    possible = True
    while len(cubes) > 0:
        if cubes[0] <= prev and cubes[-1] <= prev:
            if cubes[0] > cubes[-1]:
                prev = cubes[0]
                cubes.popleft()
            else:
                prev = cubes[-1]
                cubes.pop()
        else:
            possible = False
            break
    print("Yes") if possible else print("No")