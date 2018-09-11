package fibonacci;

public class FibonacciSeriesPrint {
	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum;
		int count = 10;
		int i;
		System.out.print(firstNum + " " + secondNum);
		
		for (i = 2; i< count; i++) {
			thirdNum = firstNum + secondNum;
			
			System.out.print(" " + thirdNum);
			firstNum = secondNum;
			secondNum = thirdNum;
		}
	}	
}


