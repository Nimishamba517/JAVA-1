import java.util.Scanner;
public class SimpleCalc{
	public static void main(String[] args)
{
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the first number : ");
	int n1=scanner.nextInt();
	System.out.print("Enter the second number : ");
	int n2=scanner.nextInt();
	System.out.println("Sum: "+(n1+n2));
	System.out.println("Difference: "+(n1-n2));
	System.out.println("Product: "+(n1*n2));
	System.out.println("Division: "+((double)n1/n2));
	System.out.println("Remainder: "+(n1%n2));
	System.out.println("Exponential:" + Math.pow(n1,n2));
	scanner.close();
	}
}
