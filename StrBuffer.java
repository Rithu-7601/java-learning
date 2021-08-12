
public class StrBuffer {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		System.out.println("Default Capacity "+ s.capacity());//16
		
		//s.append("Java is object-oriented programming language");
		//System.out.println(s.capacity());//44
		
		s.append("hello");
		System.out.println(s.capacity());
		
		s.insert(1, "* ");
		System.out.println(s+ "capacity is"+ s.capacity());//h* ellocapacity is16
		
		s.reverse();
		System.out.println(s);//olle *h
		
		//replaces the given String from the specified beginIndex and endIndex.
		s.replace(1, 3, "Welcome");
		System.out.println(s);//oWelcomee *h
		
		//deletes the given String from the specified beginIndex and endIndex.
		s.delete(1, 7);
		System.out.println(s);//oee *h
	}
	

}
