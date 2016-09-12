from collections import deque
deck = deque()
for i in range(int(input())):
    task = input().strip().split()
    if task[0] == "append":
        deck.append(task[1])
    elif task[0] == "appendleft":
        deck.appendleft(task[1])
    elif task[0] == "pop":
        deck.pop()
    else:
        deck.popleft()
for i in deck:
    print(i, end = " ")
