//Array Program
import java.lang.*;
import java.util.Scanner;
class Array
{
    public static void main(String [] args)
    {
        int [] Numbers=new int[5];
        int x;
        System.out.print("\nEnter 5 no...");
        Scanner Scan=new Scanner(System.in);
        for(x=0; x<=4; x++)
        {
            Numbers[x]=Scan.nextInt();
        }
        System.out.print("\nGiven no....");
        for(x=0; x<=4; x++)
        {
            System.out.print("\n"+(Numbers[x]));
        }
    }
}
