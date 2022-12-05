 public static void main(String[] args) {
        
   int tax = 0;
    int hours = 0;

   
     try ( 
             Scanner input = new Scanner(System.in)) {
        
         do {
             
             tax += hours;
             System.out.println("Enter hours worked : ");
             hours = input.nextInt();
         } while(hours >= 0);
         
         System.out.println("Wages includeding Tax : " + tax);
     }
  }
}

