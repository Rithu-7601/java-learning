
public class StringHandling {

	public static void main(String[] args) {
		
		//creating string obj using literal
		String s1 = "rithika";
		
		String s2 = "rithika";
		
		//checks whether both point to the same memory
		System.out.println(s1 == s2); //true	
		
		String s3 = new String("Java");
		String s4 = new String("java");
		
		//checks whether both point to the same memory
		System.out.println(s3 == s4);//false
		
		//checks whether the contents are equal
		System.out.println("contentEquals()-->" + s3.contentEquals(s4));//false
		
		System.out.println("equalsIgnoreCase()-->" + s3.equalsIgnoreCase(s4));//true
		
		s1.concat(" Delhi");
		System.out.println(s1); //rithika
		
		s1 = s1.concat(" Delhi");
		System.out.println(s1); //rithika delhi
	}

}
