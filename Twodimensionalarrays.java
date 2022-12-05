import java.util.Arrays;


public class JavaProgramming {

 public static void main(String[] args) {
    int[][] WorkerTaxprecentage = new int[3][3];
        
      
      
        WorkerTaxprecentage[0][0] = 15;  
        WorkerTaxprecentage[0][1] = 30;  
        WorkerTaxprecentage[0][2] = 50;  
        
 
        WorkerTaxprecentage[1][0] = 25;  
        WorkerTaxprecentage[1][1] = 60; 
        WorkerTaxprecentage[1][2] = 70;  
        
        WorkerTaxprecentage[2][0] = 35;  
        WorkerTaxprecentage[2][1] = 50;  
        WorkerTaxprecentage[2][2] = 70;  
        
      
        System.out.println("Employee Tax Precentages");
        System.out.println(Arrays.deepToString(WorkerTaxprecentage));
        
    }
}