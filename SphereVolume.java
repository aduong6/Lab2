import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Finding the volume of sphere");
		System.out.print("Enter diameter: ");
		double diameter = userInput.nextDouble();
		double radius = diameter/2;
		double volume = (4/3.0)*Math.PI*Math.pow(radius, 3);
		System.out.println("Volume of sphere with diameter "+diameter+" is: "+volume);
		userInput.close();
	}

}
