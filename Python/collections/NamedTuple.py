from collections import namedtuple
student = int(input())
Score = namedtuple('Score',input())
total = 0
for _ in range(student):
    lst = input().split()
    temp = Score(*lst)
    total += int(temp.MARKS)
print("%.2f" % (total/student))