val = int(input());
if val > 0:
    inpStr = input();
    T = ();
    L = [int(i) for i in inpStr.split()]
    T = tuple(L);
    print(hash(T));
