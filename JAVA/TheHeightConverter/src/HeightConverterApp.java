import java.util.Scanner;
public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the inch");
		double inch=sc.nextDouble();
		HeightConverter converter = new HeightConverter();
		System.out.println(converter.convertInchesToFeet(inch));
		sc.close();
	}
}

