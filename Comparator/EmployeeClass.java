/**
 *
 * @author kevinmbiyavanga
 */
public final class Employee {
    
private  String Fullname ;
private int age;

public Employee(String Fullname, int age)
        
        {
            this.Fullname = Fullname;
            this.age = age;
  
        }

public String toString()
        {
return "{" +
"name='" + Fullname + '\'' +
", age=" + age +
'}';
        }

public String getFullname() {
    
    return Fullname;
    
            
        }

public int getAge() {

        
        return age;
  }
        

    
} 
        
        


