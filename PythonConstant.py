class Value:
    Balance_constant_f = 100.0
    Full_Name_constant_s = "Kevin Mbiyavanga"

class Fullinfo(Value):
    def const(self):
        print("Account balance:", self.Balance_constant_f, "\n","Full Name:", self.Full_Name_constant_s)

value_in_class = Fullinfo()
value_in_class.const()