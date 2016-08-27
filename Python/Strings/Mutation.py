str = input()
inp = input().split(" ");
index = int(inp[0]);
str = str[:index]+inp[1]+str[index+1:]
print(str)
