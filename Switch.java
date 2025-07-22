//Switch case program
import java.lang.*;
import java.util.Scanner;
class Switch
{
    public static void main(String [] args)
    {
        int Num;
        int Operation;
        System.out.print("\nEnter a no....");
        Scanner Scan=new Scanner(System.in);
        Num=Scan.nextInt();
        System.out.print("\n1...Square...\n2...Cube...");
        System.out.print("\nEnter an operation.....");
        Operation=Scan.nextInt();
        switch(Operation)
        {
            case 1:
                System.out.print("\nSquare ="+(Num*Num));
                break;
            case 2:
                System.out.print("\nCube ="+(Num*Num*Num));
                break;
            default :
                System.out.print("\nInvalid Operation please try again later....");
                break;
        }
    }
}
