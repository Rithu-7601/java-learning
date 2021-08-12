import java.util.Scanner;
public class CardGen {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		System.out.println("Enter the student name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter no of subjects: ");
		int sub = sc.nextInt();
		
		int[] marks = new int[sub];
		
		marksEntry(marks);
		printReportCard(name,marks,sub);

	}
	static void marksEntry(int[] marks) {
		 
		
		for (int i = 0; i < marks.length; i++)
		{
			System.out.print("enter mark for Subject-"+(i+1) +" - ");
			marks[i] = sc.nextInt();		
			
			
		}
		
	}
	static void printReportCard(String name, int[] marks, int sub) {
		
		System.out.println("----------------------------");
		System.out.println("\tReport Card");
		System.out.println("----------------------------");
		System.out.println("Subjects\tMarks");
		System.out.println("----------------------------");
		
		int total = 0;
		for(int i=0; i<sub; i++) {
			total += marks[i];
			System.out.println("subject "+(i+1)+" - "+ marks[i]);
		}
		System.out.println("----------------------------");
		float avg = ((float)total)/sub;
		System.out.printf("total %d average: %.2f \n",total,avg);
		System.out.println("----------------------------");
	
	}
	}