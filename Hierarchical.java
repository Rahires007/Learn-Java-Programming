//Hierarchical inheritance
import java.lang.*;
import java.util.Scanner;
class GrandFather
{
    String GrandFather_Name="Abc";
    String Sur_Name="Xyz";
}
class Father extends GrandFather
{
    String Father_Name="Pqr";
    void set()
    {
        System.out.print("\nMy Name :-"+(Father_Name));
        System.out.print("\nFather Name :-"+(GrandFather_Name));
        System.out.print("\nSur Name :-"+(Sur_Name));
    }
}
class  Kaka extends GrandFather
{
    String Kaka_Name="Rst";
    void get()
    {
        System.out.print("\nMy Name :-"+(Kaka_Name));
        System.out.print("\nFather Name :-"+(GrandFather_Name));
        System.out.print("\nSur Name :-"+(Sur_Name));
    }
}
class Sample
{
    public static void main(String [] args)
    {
        Father F=new Father();
        F.set();
        Kaka K=new Kaka();
        K.get();
    }
}

