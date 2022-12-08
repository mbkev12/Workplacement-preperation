
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
/**
 *
 * @author kevinmbiyavanga
 */
public class Main {
    
    
    public static void main(String[] args)
{
    
List<Employee> Employees;
        Employees = new ArrayList<>(Arrays.asList(
                new Employee("John", 15),
                new Employee("Sam", 25),
                new Employee("Will", 20),
                new Employee("Dan", 20),
                new Employee("Joe", 10)
        ));
Collections.sort(Employees, (Employee p1, Employee p2) -> p1.getAge() - p2.getAge());
System.out.println(Employees);
}
    
    
    
}
