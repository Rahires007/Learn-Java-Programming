//Encapsulation program
import java.lang.*;
import java.util.Scanner;
class Encapsulation
{
    int Num;
    void Test()
    {
        Num=100;
        System.out.print("\nNumber ="+(Num));
    }
    public static void main(String [] args)
    {
        Encapsulation Encap=new Encapsulation();
        Encap.Test();
    }
}
