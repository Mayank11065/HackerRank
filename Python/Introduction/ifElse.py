inp = input();
n = int(inp)

if n%2 == 1:
    print("Weird")  
elif (n>=2 and n <= 5) or n > 20:
    print("Not Weird")
else:
    print("Weird")
