package lcm;

public class FindLCM {
public static void main(String[] args) {
	int n1 = 6, n2 = 3, lcm1;
	lcm1 = (n1 > n2) ? n1 : n2;
	while(true) {
		if( lcm1 % n1 ==0 && lcm1 % n2 ==0 ) {
			System.out.printf("LCM of %d and %d is %d",n1,n2,lcm1);
			break;
		}
		++lcm1;
	}
}
}
