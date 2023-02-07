# Python program to demonstrate
# nonlocal keyword
 
print ("The Balance of Kevin Mbiyavanga's Current Account : ", end ="")
def outer():
    a = 10000
    def inner():
        nonlocal a 
        a = 10000
    inner()
    print (a)
   
outer()
   
# demonstrating without non local 
# inner loop not changing the value of outer a

print ("Kevin Mbiyavanga's Monthly Salary : ", end ="")
def outer():
    a = 4000
    def inner():
        a = 4000
    inner()
    print (a)
   
outer()