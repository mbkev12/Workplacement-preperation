
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;




/**
 *
 * @author kevinmbiyavanga
 */
public class JavaProgramming

{ 
 
   public static void main(String args[]) throws Exception {
      //Creating a Scanner object
    
      Scanner sc = new Scanner(System.in);
      FileInputStream file = new FileInputStream("input.txt");
      InputStreamReader input1 = new InputStreamReader(file);
      BufferedReader in = BufferedReader(r);
      
    
      
      //Creating a StringBuffer object
      System.out.println("Enter Tax Rate: (TaxA, TaxB, TaxC, TaxD)");
      char grade = sc.next().toCharArray()[0];
      if(grade != 'A')if(grade=='B'){
          System.out.println("Your tax has been calculated at a high rate of TaxA or TaxB: ");
      }else if(grade=='C'){
          System.out.println("Your tax rate has been calculated at an average rate" + "any bonus to your salary will bring you to, a tax rate of A or B ");
      }else if(grade=='D'){
          System.out.println("You tax rate has been calculated at a low income rate");
      }else {
          System.out.println("Improper input");
      }else {
          System.out.println("Your Tax rate has been calculated at the hightest rate");
       }
   }

    private static void InputStreamReader(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
