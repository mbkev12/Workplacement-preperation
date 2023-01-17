package inlinefunctions;

public class CallByValueDemo
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Kevin", 10);
        Student student2 = new Student("Kevin2", 11);
 
        System.out.println("student - Name: " + student1.fullname + "\t" + "Hoursworked: " + student1.Workhours);
        System.out.println("student - Name: " + student2.fullname + "\t" + "hoursworked: " + student2.Workhours);
        System.out.println(); //inserting new line
 
 
        swap (student1, student2);
 
        System.out.println(); //inserting new line
        System.out.println("student - Name: " + student1.fullname + "\t" + "Hoursworked: " + student1.Workhours);
        System.out.println("student - Name: " + student2.fullname + "\t" + "HoursWorked: " + student2.Workhours);
    }
 
    static void swap (Student x1, Student x2)
    { 
       
        Student temp = x1;
        x1 = x2;
        x2 = temp;
 
 
        System.out.println("hours swaped  - Name: " + x1.fullname + "\t" + "HoursWorked: " + x1.Workhours);
        System.out.println("hours swaped - Name: " + x2.fullname + "\t" + "HoursWorked: " + x2.Workhours);
    }
}
 