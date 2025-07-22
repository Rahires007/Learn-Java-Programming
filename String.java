//String Program
import java.lang.*;
import java.util.*;
class Derived
{
    public static void main(String [] args)
    {
        String Name;
        System.out.print("\nEnter your name....");
        Scanner Scan=new Scanner(System.in);
        Name=Scan.nextLine();
        System.out.print("\nHello..."+(Name));
    }
}
