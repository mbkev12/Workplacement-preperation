public class JavaProgramming {

 public static void main(String[] args) {
        
        int index = 0;
        while (index++ < 10) {
            
         
            if ((index % 2) == 0) {
                continue;
            }
            System.out.println("Tax option : " + index);
        }
    }
}  

