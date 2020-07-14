
public class ReverseString {

	public static void main(String[] args) {

		//Reverse a String: 
		// Difference between String and StringBuffer
		// Do we have reverse function in String? No.
		
		String s = "Hello World";
		
		//1. Using for Loop
		int len = s.length(); //8
		String rev = "";
		
		for(int i=len-1; i>=0; i--) {
			
			rev = rev +s.charAt(i);// reversing Hello World
			
		}
		System.out.println(rev);// don't pring inside the for loop.
		
		
		//2. Using StringBuffer Class:
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
		
		
	}

}
