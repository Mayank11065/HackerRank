input()
main = set(map(int, input().split()))
sets = int(input())
for _ in range(sets):
    oper = input().split()
    temp = set(map(int, input().split()))
    if "intersection_update" == oper[0]:
        main.intersection_update(temp)
    elif "symmetric_difference_update" == oper[0]:
        main.symmetric_difference_update(temp)
    elif "update" == oper[0]:
        main.update(temp)
    else:
        main.difference_update(temp)

print(sum(main))