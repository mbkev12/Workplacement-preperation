calculate = 1
number = 0
pick = 0

while True:
    # input the number 
    number = int(input("Enter a number: "))
    
    # break if num is 0
    if number==0:
        break   # terminates inner loop
    
    # print the table 
    calculate = 1
    while calculate<=10:
        print(number*calculate)
        calculate += 1

    # input choice
    pick = int(input("press 1 to continue..."))
    if pick != 1:
        break   # terminates outer loop

print("bye bye!!!")
