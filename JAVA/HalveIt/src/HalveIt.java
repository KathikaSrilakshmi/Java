import java.util.Scanner;

public class HalveIt {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to halve the number");
		double num=sc.nextDouble();
		System.out.println(halveTheNumber(num));
		sc.close();
	}
	public static double halveTheNumber(double num)
	{
		return num/2;
	}

}
