k = int(input())
for _ in range(k):
    input()
    A = set(map(int, input().split()))
    input()
    B = set(map(int,input().split()))
    print(A <= B)