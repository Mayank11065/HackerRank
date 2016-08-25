cases = int(input());
L = []
while cases > 0:
    temp= [];
    temp.insert(0,input())
    temp.insert(1,float(input()))
    L.append(temp)
    cases -= 1;
    
markSet = {marks for [name,marks] in L}
secondVal = sorted(markSet)[1]
L.sort(key=lambda x: x[1])
N = [name for [name,marks] in L if marks == secondVal]
N.sort()
for i in N:
    print(i)
