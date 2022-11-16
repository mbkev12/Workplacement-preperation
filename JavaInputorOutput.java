import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();
        System.out.println("You entered " + salary);

        input.close();
    }
}
