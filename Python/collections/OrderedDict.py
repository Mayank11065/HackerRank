from collections import OrderedDict
superMarket = OrderedDict()
for i in range(int(input())):
    inp = input().split()
    name = ' '.join(inp[:len(inp)-1])
    price = int(inp[len(inp)-1])
    superMarket[name] = superMarket.get(name,0) + price

for val in superMarket:
    print("%s %d" %(val,superMarket[val]))