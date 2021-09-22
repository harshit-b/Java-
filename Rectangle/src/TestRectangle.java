import java.util.Scanner;

public class TestRectangle {
	public static void main(String args[]) {
		double length, 
				width, 
				area, 
				perimeter;
		
		Rectangle rectangle = new Rectangle();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the rectangle: ");
		length = input.nextDouble();
		System.out.print("Enter the width of the rectangle: ");
		width = input.nextDouble();
		
		rectangle.set(length, width);
		area = rectangle.Area();
		perimeter = rectangle.Perimeter();
		
		System.out.println("Area of Rectangle : " + area);
		System.out.println("Perimeter of Rectangle : " + perimeter);
	}
}
