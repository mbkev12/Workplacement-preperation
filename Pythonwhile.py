calculate = 1
number = 0 
pick = 0 

while true

#Enter any number 

number = int(Enter("Pick a number -"))

#Dont accept number 0

if number ==0 
 break  #Dis(able the actuall loop 

 # Print calculated numebrs 

 calculate = 1 
 while calculate<=10
 print(number*calculate)
 calculate += 1 

 #Make an operation with number example 1
 pick = int(input("Enter 1 allow you go forward "))
 if pick !=1
 break 

 print("End ")


