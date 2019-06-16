import java.util.Scanner;
public class SI
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====== ========");
        System.out.println("Simple Interest");
        System.out.println("====== ========");
        
        System.out.println("");
        
        System.out.println("Enter Principal");
        double p = scan.nextDouble();

        System.out.println("");
        
        System.out.println("Enter Rate");
        double r = scan.nextDouble();
        
        System.out.println("");
        
        System.out.println("Enter Time");
        double t = scan.nextDouble();
        
        System.out.println("");
        
        System.out.println("Interest: " + "Rs." + (p*r*t/100));
    } 
}   