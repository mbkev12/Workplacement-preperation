package inlinefunctions;

public class PassByreferenceDemo
{
    public static void main (String[]args)
    {
        Animal a = new Animal("Lion");
        Animal b = new Animal("Elephant");
        System.out.println ("Before swapping, a = " + a.a + " and b = " + b.a);
        
       
        swapFunction (a, b);
        System.out.println("\n**Now, Before and After swapping values will be different here**:");
        System.out.println ("After swapping, a = " + a.a + " and b is " + b.a);
    }
    
    public static void swapFunction (Animal a, Animal b)
    {
        System.out.println ("Before swapping(Inside), a = " + a.a + " | b = " +b.a);
        // Swap n1 with n2
        Animal c = new Animal (a.a);
        a.a = b.a;
        b.a = c.a;
        System.out.println ("After swapping(Inside), a = " + a.a + " | b = " +b.a);
    }
}
class Animal
{
    public String a;
    public Animal (String a)
    {
        this.a = a;
    }
}