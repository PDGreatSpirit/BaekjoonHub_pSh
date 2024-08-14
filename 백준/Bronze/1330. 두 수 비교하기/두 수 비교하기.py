numbers = list(map(int,input().split(" ")))
if numbers[0] == numbers[1]:
    print("==")
if numbers[0] > numbers[1]:
    print(">")
if numbers[0] < numbers[1]:
    print("<")