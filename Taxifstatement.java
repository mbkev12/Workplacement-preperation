public class JavaProgramming {
  public static void main(String[] args) {
 
      

 int Taxx = 150, Taxy = 80, Taxz = 60;	
  boolean Tax;
  if(Tax = (Taxx > Taxy) || (Taxy < Taxz))
       System.out.println("This Tax value is : "+Tax);	 

  if(Tax = (Taxx > Taxy) || (Taxy > Taxz))
      System.out.println("This Tax value is :"+Tax);	

  if(Tax = (Taxx < Taxy) || (Taxy < Taxz))
      System.out.println("This Tax value is :"+Tax);

  if(Tax = (Taxx < Taxy) || (Taxy > Taxz))
      System.out.println("This Tax value is : "+Tax);
  }
}

