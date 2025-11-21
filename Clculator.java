package number;

public class Clculator 
{
	public static void main(String[] args)
	{
		System.out.println(add(1,5));
	}
	public static int add(double n1,double n2)
	{
		double sum=n1+n2;
		System.out.print("ADDITION IS : ");
		return (int) sum;
	}
	public double substraction(double n1,double n2)
	{
		double sub=n1-n2;
		System.out.print("SUBSTRACTION IS : ");
		return sub;
	}
	public double multiplication (double n1, double n2)
	{
		double mul= n1*n2;
		System.out.print("MULTIPLICATION IS : ");
		return mul;
	}
	public double division(double n1, double n2)
	{
		double div=n1/n2;
		System.out.print("DIVISION IS : ");
		return div;
	}
	
}
