
public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "#$#$#%$%$%%JAVA*^*)()*)( 09232423^&%&^ Shams";
		String s1 = "$$$$$$$$ Shams&&&&&&&Mehry";
		
		// Regular Expression: [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(s1);


		
		
		
		
	}

}
