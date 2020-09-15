import java.util.Scanner;
import Tasks.Tasks1;
import Tasks.Tasks2;
import Tasks.Tasks3;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Choose block of tasks:");
		int m = in.nextInt();
		switch(m) {
		case 1 :
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
		break;
		
		case 2:
		System.out.println("Task 1");
		System.out.println("Input the number:");
		int digit = in.nextInt();
	    System.out.println("Input the size of array:");
	    int n1 = in.nextInt();
	    char[] word;
	    word = new char [n1];
	    for (int i=0; i<n1; i++)
	    {
	    	System.out.println("Input the element of array:");
	    	word[i] = in.next().charAt(0);
	    }
		System.out.println("Result: ");
		Tasks2.repeat(word, digit);
		System.out.println("");
		
		System.out.println("Task 2");
		System.out.println("Input the size of array:");
		int n2 = in.nextInt();
		int[] array1 = new int [n2];
		for (int i=0; i<n2; i++)
	    {
	    	System.out.println("Input the element of array:");
	    	array1[i] = in.nextInt();
	    }
		System.out.println("Result: " + Tasks2.differenceMaxMin(array1));
		
		System.out.println("Task 3");
		double[] array2 = {1,2,4,1};
		System.out.println("Result: " + Tasks2.isAvgWhole(array2));
		
		System.out.println("Task 4");
		int[] array3 = {1,2,4,1};
		System.out.println("Result: ");
		Tasks2.cumulativeSum(array3);
		System.out.println("");
		
		System.out.println("Task 5");
		String digital = "400";
		System.out.println("Result: " + Tasks2.getDecimalPlaces(digital));
		
		System.out.println("Task 6");
		int digital1 = 12;
		System.out.println("Result: " + Tasks2.fibonacci(digital1));
		
		System.out.println("Task 7");
		System.out.println("Input the size of array:");
	    int n3 = in.nextInt();
	    String word2 = "1234";
		System.out.println("Result: " + Tasks2.isValid(word2));
		
		System.out.println("Task 8");
		String word3 = "sparkling", word4 = "groups";
		System.out.println("Result: " + Tasks2.isStrangePair(word3, word4));
		
		System.out.println("Task 9");
		String word5 = "auto-mobile", word6 = "auto-";
		System.out.println("Result: " + Tasks2.isPrefix(word5, word6));
		String word7 = "psycho-logy", word8 = "-logy";
		System.out.println("Result: " + Tasks2.isSuffix(word7, word8));
		
		System.out.println("Task 10");
		System.out.println("Input the number:");
		int step = in.nextInt();
		System.out.println("Result: " + Tasks2.boxSeq(step));
		break;
		
		case 3:
		System.out.println("Task 1");
		System.out.println("Input the first number:");
		int a9 = in.nextInt();
		System.out.println("Input the second number:");
		int b9 = in.nextInt();
		System.out.println("Input the third number:");
		int c9 = in.nextInt();
		System.out.println("Result:");
		Tasks3.solutions(a9,b9,c9);
		System.out.println("");
		
		System.out.println("Task 2");
		String sentence = "zipdddzipdzip";
		System.out.println("Result: " + Tasks3.findZip(sentence));
		
		System.out.println("Task 3");
		System.out.println("Input the number:");
		int digit1 = in.nextInt();
		System.out.println("Result: " + Tasks3.checkPerfect(digit1));
		
		System.out.println("Task 4");
		String pair = "Misha";
		System.out.println("Result: ");
		Tasks3.flipAndChars(pair);
		System.out.println("");
		
		System.out.println("Task 5");
		String code = "#ffA000";
		System.out.println("Result: ");
		System.out.println("Result: " + Tasks3.isValidHexCode(code));
		
		System.out.println("Task 6");
		int[] array4 = {1,2,3,4,4};
		int[] array5 = {1,2,3,4,4,5};
		System.out.println("Result: " + Tasks3.same(array4, array5));
		
		System.out.println("Task 7");
		int digit2 = 999;
		System.out.println("Result: " + Tasks3.isKaprekar(digit2));
		
		System.out.println("Task 8");
		String binary = "0011000100001111";
		System.out.println("Result: ");
		Tasks3.longestZero(binary);
		
		System.out.println("Task 9");
		System.out.println("Input the number");
		int prime = in.nextInt();
		System.out.println("Result: " + Tasks3.nextPrime(prime));
		
		System.out.println("Task 10");
		System.out.println("Input the first number:");
		int side1 = in.nextInt();
		System.out.println("Input the second number:");
		int side2 = in.nextInt();
		System.out.println("Input the third number:");
		int side3 = in.nextInt();
		System.out.println("Result: " + Tasks3.rightTriangle(side1,side2,side3));
		}
	}

}
