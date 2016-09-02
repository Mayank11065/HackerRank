k = int(input())
rooms = list(map(int, input().split()))
unique = set(rooms)
roomsTotal = sum(rooms)
uniqueTotal = sum(unique)
diff = (k*uniqueTotal) - roomsTotal
capRoom = diff/(k-1)
print(int(capRoom))