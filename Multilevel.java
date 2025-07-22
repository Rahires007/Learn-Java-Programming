//Multilevel inheritance
import java.lang.*;
class GrandFather
{
    String GrandFather_Name="Abc";
    String Sur_Name="xyz";
}
class Father extends GrandFather
{
    String Father_Name="Pqr";
}
class Child extends Father
{
    void Test()
    {
        System.out.print("\nFather Name :-"+(Father_Name));
        System.out.print("\nGrandFather Name :-"+(GrandFather_Name));
        System.out.print("\nSur Name :-"+(Sur_Name));
    }
    public static void main(String [] args)
    {
        Child C=new Child();
        C.Test();
    }
}
