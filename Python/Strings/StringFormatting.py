import textwrap
val = int(input())
fill = len(bin(val)[2:])

for i in range(1,val+1,1):
    print(str(i).rjust(fill,' ') + " " + oct(i)[2:].rjust(fill,' ') + " " + hex(i)[2:].upper().rjust(fill,' ') + " " + bin(i)[2:].rjust(fill,' '))