//If else IF statement program
import java.lang.*;
import java.util.Scanner;

class IFelseIF 
{
    public static void main(String[] args) 
  {
        int Num;
        Scanner Scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        Num = Scan.nextInt();
        
        if (Num > 0) 
        {
            System.out.println("Given number is positive.");
        } 
        else if (Num < 0) {
            System.out.println("Given number is negative.");
        } 
        else 
        {
            System.out.println("Given number is zero.");
        } 
     
    }
}
