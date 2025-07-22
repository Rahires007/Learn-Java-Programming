//Function Overrloading
import java.lang.*;
import java.util.*;
class Overloading
{
    void Add(int x,int y)
    {
        System.out.print("\nAdd ="+(x+y));
    }
    void Add(int x,int y,int z)
    {
        System.out.print("\nAdd ="+(x+y+z));
    }
    public static void main(String [] args)
    {
        Overloading O=new Overloading();
        O.Add(10,20);
        O.Add(10,20,30);
    }
}
