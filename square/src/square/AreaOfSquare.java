package square;
import java.util.Scanner;
public class AreaOfSquare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the side of a square :");
	double side = sc.nextDouble();
	double area = side * side;
	System.out.println("Area of Square = "+area);
	sc.close();
}
}
