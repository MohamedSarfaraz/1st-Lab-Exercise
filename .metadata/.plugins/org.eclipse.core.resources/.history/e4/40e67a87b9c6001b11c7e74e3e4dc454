package reversingthenumber;
import java.util.Scanner;
public class ReverseNumberWhile {
public static void main(String[] args) {
	int num = 0;
	int reversenum = 0;
	System.out.println("Enter the number : ");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	while(num!=0) {
		reversenum = reversenum * 10;
		reversenum = reversenum + num%10;
		num = num/10;
		sc.close();
	}
	System.out.println("Reversed number = "+reversenum);
}
}
