package findingleapyear;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the year to check");
	int year = sc.nextInt();
	sc.close();
	boolean isLeap = false;
	if(year%4==0) {
		if(year%100==0) {
			if(year%400==0)
				isLeap=true;
			else
				isLeap=false;
		}
		else
			isLeap=true;
	}
	else
		isLeap=false;
	if(isLeap==true)
		System.out.println("The year is LEAP YEAR");
	else
		System.out.println("The year is NOT LEAP YEAR");
}
}
