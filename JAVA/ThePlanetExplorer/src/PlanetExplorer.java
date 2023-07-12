import java.util.Scanner;

public class PlanetExplorer {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius=sc.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();
		double res=explorer.calculateSurfaceArea(radius);
		System.out.println(res);
		sc.close();
	}
	public double calculateSurfaceArea(double radius)
	{
		return 4 * Math.PI * Math.pow(radius, 2);
	}
}
