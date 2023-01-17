package inlinefunctions;


import java.util.*;
class OnedimensionalScanner
{
   public static void main(String args[])
   {    
	int len;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter how much days worked : ");
		len=sc.nextInt();
		int a[]=new int[len];  	 
		System.out.print("Enter " + len + " Hours worked to Store in Array :\n");
		    for(int i=0; i<len; i++)
		    {
		       a[i] = sc.nextInt();
		    }   
		    System.out.print("hours worked in Array are :\n");
		    for(int i=0; i<len; i++)
		    {
		       System.out.print(a[i] + "  ");
		    }
	}  
   }
}