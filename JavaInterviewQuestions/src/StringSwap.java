
public class StringSwap {

	public static void main(String[] args) {


		/// WAP to swap strings without using temp/third variable:
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before swapping:");
		System.out.println("The Value of a is:"+b);
		System.out.println("The Value of b is:"+b);
		
		//Step 1. Append a and b; 
		
		a = a+b; // Hello-loWorld
		
		//Step 2. Store initial string a in String b:
		b = a.substring(0,a.length()-b.length());
		
		//Step 3. Store initial string b in String a:
		
		a = a.substring(b.length());
		
		System.out.println("The value of a and b after swapping");
		
		System.out.println("The value of a is:" +a);
		
		System.out.println("The value of b is:"+b);
		
		
		
		
	}

}
