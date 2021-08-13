
public class StringMethods {

	public static void main(String[] args) {
		
		String str1 = "edureka";
		String s2 = " javatpoint ";
		String s3 = "Java is an island Java";
		
		System.out.println(str1.length());// 7
		
		//charAt() method returns a character at specified index.
		System.out.println(str1.charAt(5));// k
		
		//to uppercase and lowercase
		System.out.println(str1.toUpperCase()); //EDUREKA
		System.out.println(str1.toLowerCase()); //edureka
		
		//trim -> d eliminates white spaces before and after the String
		System.out.println(s2.trim());
		
		System.out.println(s2.startsWith("va"));//false
		System.out.println(s2.endsWith("nt "));//true
		
		System.out.println(s3.replace("Java", "bali"));
		
		System.out.println(str1.indexOf("e"));
		System.out.println(str1.lastIndexOf("e"));
		
		//to check whether substring is available or not
		System.out.println(str1.indexOf("esg"));// -1 (if not available)
		
	}

}
