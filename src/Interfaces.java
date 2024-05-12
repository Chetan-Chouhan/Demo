//Interface is a mechanism to achieve abstraction and multiple inheritance in java.
//Interface is used to implement abstraction.
//Interfaces can have abstract methods and variables.
//It is also used to achieve loose coupling.

//Example
interface Animal{
    public void animalSound();
    public void sleep();
}
class Pig implements Animal{
    public void animalSound()
    {
        System.out.println("Pig Sounds");
    }
    public void sleep()
    {
        System.out.println("Pig sleeps");
    }
}
public class Interfaces {
    public static void main(String args[])
    {
        Pig myPig=new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}



//Multiple Inheritance by Interface
/*interface Print
{
    void print();
}
interface Show
{
    void show();
}
class interfaces implements Print,Show{
    public void print()
    {
        System.out.println("Hello");
    }
    public void show()
    {
        System.out.println("Welcome");
    }
    public static void main(String args[])
    {
        interfaces Eg=new interfaces();
        Eg.print();
        Eg.show();
    }
} */