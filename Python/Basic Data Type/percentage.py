cases = int(input());
dict={}
for _ in range(cases):
    strInp = input().split(" ")
    marks = [float(i) for i in strInp[1:len(strInp)]]
    dict[strInp[0]] = sum(marks)/len(marks)

name = input()
#Displaying Float till 2 decimal places
print('%.2f' % dict[name])
