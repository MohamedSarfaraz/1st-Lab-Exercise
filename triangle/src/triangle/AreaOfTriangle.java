package triangle;
import java.util.Scanner;
public class AreaOfTriangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of the triangle : ");
	double length = sc.nextDouble();
	System.out.println("Enter the width of the triangle :");
	double width = sc.nextDouble();
	double area = (width*length)/2;
			System.out.println("Area of triangle = "+area);
			sc.close();
	
}
}
