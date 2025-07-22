//IF Else statement program
import java.lang.*;
import java.util.Scanner;
class IFelse
{
    public static void main(String [] args)
    {
        int Age;
        System.out.print("\nEnter your age....");
        Scanner Scan=new Scanner(System.in);
        Age=Scan.nextInt();
        if(Age>=18)
        {
            System.out.print("\nYou are eligible ");
        }
        else
        {
            System.out.print("\nYou are not eligible");
        }
    }
}
