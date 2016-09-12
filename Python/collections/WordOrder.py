from collections import OrderedDict
ordered = OrderedDict()
for i in range(int(input())):
    val = input()
    ordered[val] = ordered.get(val,0) + 1
print(len(ordered))
for i in ordered:
    print(ordered[i], end = ' ')