//All arithmetic operation
import java.lang.*;
import java.util.Scanner;
class Operation
{
    public static void main(String [] args)
    {
        int Num1,Num2;
        System.out.print("\nEnter 2 no....");
        Scanner Scan=new Scanner(System.in);
        Num1=Scan.nextInt();
        Num2=Scan.nextInt();
        System.out.print("\nAdd ="+(Num1+Num2));
        System.out.print("\nSub ="+(Num1-Num2));
        System.out.print("\nMulti ="+(Num1*Num2));
        System.out.print("\nDiv ="+(Num1/Num2));
    }
}
