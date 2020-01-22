import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double length;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
		char measureAgain = 'y';
		
		while (measureAgain == 'y') {
			System.out.print("Enter length of the classroom: ");
			length = keyboard.nextDouble();
			
			System.out.print("Enter width of the classroom: ");
			width = keyboard.nextDouble();
			
			System.out.print("Enter height of the classroom: ");
			height = keyboard.nextDouble();
		
			area = length * width;
			perimeter = (2 * length) + (2 * width);
			volume = length * width * height;
			System.out.println("The area of the classroom is " + area);
			System.out.println("The perimeter of the classroom is " + perimeter);
			System.out.println("The volume of the classroom is " + volume);
		
			System.out.println("Would you like to continue measuring classrooms? (y/n) ");
			measureAgain = keyboard.next().charAt(0);
			} 
		
		System.out.print("Goodbye");
		
		keyboard.close();
	}

}
