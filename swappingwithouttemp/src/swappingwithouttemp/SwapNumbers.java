package swappingwithouttemp;

public class SwapNumbers {
public static void main(String[] args) {
	int first = 120, second = 220;
	System.out.println("--BEFORE SWAP--");
	System.out.println("FIRST NUMBER = "+first);
	System.out.println("SECOND NUMBER = "+second);
	first=first-second;
	second=first+second;
	first=second-first;
	System.out.println("--AFTER SWAP--");
	System.out.println("FIRST NUMBER = "+first);
	System.out.println("SECOND NUMBER = "+second);
	
}
}
