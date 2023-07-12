import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount,rate and time");
		double principal=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();
		System.out.println(calculator.calculateSimpleInterest(principal, rate, time));
		sc.close();
	}

}
