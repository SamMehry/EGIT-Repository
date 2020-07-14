
public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		
		int x = 5; //0101
		int y = 10; //1010
		
		//x = 10, y = 5
		 //1. Swamping using third variable, t. 
		
		int t; 
		t = x;
		x = y; 
		y = t; 
		
		//2. Swapping without using a third variable, instead using + operator
		
		x = x+y; //15
		y = x - y; //5
		x = x - y; // 10
		
		//3. Swapping without using a third variable, using * operator
		
		x = x * y; //50
		y = x/y; //5
		x = x/ y; //10
		
		//4. Using XOR ^ to swap
		
		x = x^y; //15-->1111
		y = x^y; //10-->1010
		x = x^y; // 5--> 0101
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
