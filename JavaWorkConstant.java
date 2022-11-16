    import java.util.Scanner;  

    public class Employerpayment
    {  
    //constant   
    private static final double PRICE=2000;  
    public static void main(String[] args)  
    {  
    int tax;  
    double total_bill;  
    System.out.print("Enter the amount of tax that must be paid  ");  
    Scanner sc=new Scanner(System.in);  
    unit=sc.nextInt();  
    total_bill=PRICE - tax;  
    System.out.println("The total amount of your pay including tax is  "+total_bill);  
    }  
    }  
    
