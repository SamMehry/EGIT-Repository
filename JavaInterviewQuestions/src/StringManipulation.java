
public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "The rains have started here";
		String str1 = "The Rains have started here";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf('r'));
		System.out.println(str.indexOf('r',str.indexOf('r')+1));
		System.out.println(str.indexOf("started"));
		System.out.println(str.indexOf("Shams"));// when the word/ character is not in the list it will give -1 result.
		
		// String Comparison: 
		
		System.out.println(str.contentEquals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		
		//Subtracting: 
		System.out.println(str.substring(0,9));
		
		//trim: 
		String s = "      Hello Shams     ";
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", ""));
		String date = "01-01-2017"; // change to 01/01/2017
		System.out.println(date.replace("-",  "/"));
		
		//Split:
		String test = "Hello_World_Test_Selenium";
		String testval [] = test.split("_");
		for(int i=0; i<testval.length; i++) {
			
		System.out.println(testval[i]);
		}
		
		String s2 = "cares";
		System.out.println(s2.concat("s"));
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		
		
		
		
		
		


		
		
		
	}

}
