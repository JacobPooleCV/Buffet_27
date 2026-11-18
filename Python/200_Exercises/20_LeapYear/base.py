year = int(input("Please enter a year you'd like to check! "))
if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
    print("The year", year, "is a leap year!")
else:
    print("The year", year, "is not a leap year!")