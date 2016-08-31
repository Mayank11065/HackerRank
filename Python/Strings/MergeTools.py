inpStr = input()
K = int(input())
L = [inpStr[i:i+K] for i in range(0,len(inpStr),K)]
res = [''.join(sorted(set(word), key=word.index)) for word in L]
for word in res:
    print(word)