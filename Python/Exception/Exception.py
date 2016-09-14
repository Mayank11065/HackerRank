for i in range(int(input())):
    try:
        a, b = list(map(int, input().split()))
        print(a//b)
    except (ZeroDivisionError,ValueError) as e:
        print("Error Code:", e)