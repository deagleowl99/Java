import java.util.Scanner;
import Tasks.Tasks1;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Task 1");
		System.out.println("Input the first number:");
		int a = in.nextInt();
		System.out.println("Input the second number:");
		int b = in.nextInt();
		System.out.println("Result: " + Tasks1.remainder(a,b));
		
		System.out.println("Task 2");
		System.out.println("Input the first number:");
		double a1 = in.nextDouble();
		System.out.println("Input the second number:");
		double b1 = in.nextDouble();
		System.out.println("Result: " + Tasks1.triArea(a1,b1));
		
		System.out.println("Task 3");
		System.out.println("Input the first number:");
		int a2 = in.nextInt();
		System.out.println("Input the second number:");
		int b2 = in.nextInt();
		System.out.println("Input the third number:");
		int ñ2 = in.nextInt();
		System.out.println("Result: " + Tasks1.animals(a2,b2,ñ2));
		
		System.out.println("Task 4");
		System.out.println("Input the first number:");
		double a3 = in.nextDouble();
		System.out.println("Input the second number:");
		int b3 = in.nextInt();
		System.out.println("Input the third number:");
		int ñ3 = in.nextInt();
		System.out.println("Result: " + Tasks1.profitableGamble(a3,b3,ñ3));
		
		System.out.println("Task 5");
		System.out.println("Input the first number:");
		int a4 = in.nextInt();
		System.out.println("Input the second number:");
		int b4 = in.nextInt();
		System.out.println("Input the third number:");
		int ñ4 = in.nextInt();
		System.out.println("Result: " + Tasks1.operation(a4,b4,ñ4));
		
		System.out.println("Task 6");
		System.out.println("Input the character:");
		char a5 = in.next().charAt(0);
		System.out.println("Result: " + Tasks1.ctoa(a5));
		
		System.out.println("Task 7");
		System.out.println("Input the number:");
		int a6 = in.nextInt();
		System.out.println("Result: " + Tasks1.addUpTo(a6));
		
		System.out.println("Task 8");
		System.out.println("Input the first number:");
		int a7 = in.nextInt();
		System.out.println("Input the second number:");
		int b7 = in.nextInt();
		System.out.println("Result: " + Tasks1.nextEdge(a7,b7));
		
		System.out.println("Task 9");
	    System.out.println("Input the size of array:");
	    int n = in.nextInt();
	    int[] array;
	    array = new int [n];
	    for (int i=0; i<n; i++)
	    {
	    	System.out.println("Input the element of array:");
	    	array[i] = in.nextInt();
	    }
		System.out.println("Result: " + Tasks1.sumOfCubes(array));
		
		System.out.println("Task 10");
		System.out.println("Input the first number:");
		int a8 = in.nextInt();
		System.out.println("Input the second number:");
		int b8 = in.nextInt();
		System.out.println("Input the third number:");
		int c8 = in.nextInt();
		System.out.println("Result: " + Tasks1.abcmath(a8,b8,c8));
		
	}

}
