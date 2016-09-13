from datetime import date
month,userDate,year = list(map(int,input().split()))
days = ["MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"]
day = date(year,month,userDate).weekday()
print(days[day])