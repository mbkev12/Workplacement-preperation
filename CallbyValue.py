 
string = "Callbyvalue"
 
 
def test(string):
     
    string = "String included inside the function"
    print("Inside Function:", string)
     
# Driver's code
test(string)
print("Outside Funtion:", string)