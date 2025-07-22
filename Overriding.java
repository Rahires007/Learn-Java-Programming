//Function Overriding
import java.lang.*;
import java.util.*;
class Parent
{
    void CompleteGraduation()
    {
        System.out.print("\nIn MBBS....");
    }
}
class Child extends Parent
{
    void CompleteGraduation()
    {
        System.out.print("\nIn Bcs");
    }
    public static void main(String [] args)
    {
        Child C=new Child();
        C.CompleteGraduation();
    }
}
