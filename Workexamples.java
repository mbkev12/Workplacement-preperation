

import java.util.Scanner;
class workexample
{
   public static void main(String args[])
   {
      int salary;
      String Firstname;
      String Secondname;
      String Workplace;

      Scanner obj = new Scanner(System.in); 
 
      System.out.println("Enter name:");
      Firstname = obj.nextLine();
      System.out.println("You entered Firstname"+ Firstname); 
 
      System.out.println("Enter your salary:");
      salary = obj.nextInt(); 
      System.out.println("You entered salary"+ salary); 
 
   }
}
