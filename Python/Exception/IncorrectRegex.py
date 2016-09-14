import re
for i in range(int(input())):
    is_valid = True
    try:
        re.compile(input())
    except re.error:
        is_valid = False
    print(is_valid)