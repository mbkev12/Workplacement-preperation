class EmployeeTax:
 
    # init method or constructor
    def __init__(self, empTax):
        self.empTax = empTax
 
    def __repr__(self):
        return f"EmployeeTax({self.empTax})"
   

    def __mul__(self,x):
        if type(x) is not int:
            raise Exception ("Invalid argument, must be int")
        
        self.empTax = self.empTax * x 

    
EmployeeTax = EmployeeTax("TaxBand A")
print(EmployeeTax)



