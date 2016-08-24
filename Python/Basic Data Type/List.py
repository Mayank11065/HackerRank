L = [];
#Taking input to know number of List operations to be performed
cases = int(input());
while cases > 0:
    #Taking List operations as input
    str = input()
    #Performing operations based on operation type
    split = str.split(" ");
    if split[0] == "insert":
        L.insert(int(split[1]),int(split[2]));
    elif split[0] == "print":
        print(L);
    elif split[0] == "remove":
        L.remove(int(split[1]));
    elif split[0] == "append":
        L.append(int(split[1]))
    elif split[0] == "sort":
        L.sort()
    elif split[0] == "pop":
        L.pop()
    elif split[0] == "reverse":
        L.reverse()
    cases -= 1;
