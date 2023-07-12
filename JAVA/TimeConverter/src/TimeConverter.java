import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time in min");
		int min=sc.nextInt();
		System.out.println(convertToHours(min));
		sc.close();
	}
	public static double convertToHours(int minutes)
	{
		return minutes/60.0;
	}
}
