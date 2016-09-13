from collections import Counter
import operator
str = input()
ctr = Counter(str)
sorted_x = sorted(ctr.items(), key=lambda k: (-k[1], k[0]))
for i in sorted_x[:3]:
    print("%s %d" % i)