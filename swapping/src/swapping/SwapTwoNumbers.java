package swapping;

public class SwapTwoNumbers {
public static void main(String[] args) {
	int first = 120, second = 220;
	System.out.println("--BEFORE SWAP--");
	System.out.println("FIRST NUMBER = "+first);
	System.out.println("SECOND NUMBER = "+second);
	int temporary = first;
	first = second;
	second = temporary;
	System.out.println("--AFTER SWAP--");
	System.out.println("FIRST NUMBER = "+first);
	System.out.println("SECOND NUMBER = "+second);
}
}
