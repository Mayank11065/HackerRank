input()
eng = set(map(int, input().split()))
input()
french = set(map(int, input().split()))

print(len(eng.difference(french)))