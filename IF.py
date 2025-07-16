//IF Conditional statement program
import java.lang.*;
import java.util.Scanner;
class IF
{
    public static void main(String [] args)
    {
        int Password;
        System.out.print("\nEnter a password....");
        Scanner Scan =new Scanner(System.in);
        Password=Scan.nextInt();
        if(Password==1137)
        {
            System.out.print("\nWelcome....");
        }
        if(Password!=1137)
        {
            System.out.print("\nPlease try again...");
        }
    }
}
