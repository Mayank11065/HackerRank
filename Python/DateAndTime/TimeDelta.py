from datetime import datetime
for i in range(int(input())):
    t1 =datetime.strptime(input(),"%a %d %b %Y %H:%M:%S %z")
    t2 = datetime.strptime(input(), "%a %d %b %Y %H:%M:%S %z")
    t = t2-t1
    print(int(abs(t.total_seconds())))
