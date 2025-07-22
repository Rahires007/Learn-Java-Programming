//Single inheritance program
import java.lang.*;          
import java.util.Scanner;    

class Parent 
{
    String Father_Name = "Abc";
    String Sur_Name = "Xyz";
}

class Child extends Parent 
{
    void Test() 
    {
        System.out.print("\nFather name :-" + (Father_Name));
        System.out.print("\nSur name :-" + (Sur_Name));
    }

    public static void main(String[] args) 
    {
        Child C = new Child();
        C.Test();
    }
}
