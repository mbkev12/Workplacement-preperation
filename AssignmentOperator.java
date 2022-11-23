public class TaxCalculations
{ 
    public static void main(String[] args)
    { 
        
        //Assignment Operator
       int TaxA = 1000, TaxB = 300, TaxC = 5000; 
       
       //Arithmetic Operator
       int TaxD = 1000, TaxE = 3000, TaxCal;
       
      
    //Assignment Operator
    TaxA += TaxB; 
    TaxB -= TaxA + TaxC; 
    TaxC *= TaxA * TaxB;
    
    //Arithmetic Operators
    TaxCal=TaxD + TaxE;
    
    
    
//Assignment Operator
 System.out.println("TaxA = " +TaxA ); 
 System.out.println("TaxB = " +TaxB ); 
 System.out.println("TaxC = " +TaxC ); 
 
 //Arithmetic Operators
 System.out.println(TaxCal);
 } 
}

