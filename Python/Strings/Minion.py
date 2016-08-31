str = input()
vowel = ['a','e','i','o','u']
stuart = kevin = 0
length = len(str)
for i in range(length):
    if(str[i].lower() in vowel):
        kevin += length-i
    else:
        stuart += length-i

if (stuart > kevin):
    print("Stuart %d" % stuart)
elif (stuart < kevin):
    print("Kevin %d" % kevin)
else:
    print("Draw")