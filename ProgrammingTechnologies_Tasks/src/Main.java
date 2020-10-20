import java.util.Scanner;
import Tasks.Tasks1;
import Tasks.Tasks2;
import Tasks.Tasks3;
import Tasks.Tasks4;
import Tasks.Tasks5;
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
		break;
		
		case 4:
		System.out.println("Task 1");
		int words = 10;
		int characters = 7;
		String text = "I am the best of your pupils of our school!";
		System.out.println("Result: ");
		System.out.println(Tasks4.bessie(words, characters, text));
		
		System.out.println("Task 2");
		String brackets = "((())())(()(()()))";
        System.out.println("Result: " + Tasks4.split(brackets)); 
		
		System.out.println("Task 3");
		String methodname = "method_name_name";
		String methodname2 = "shipBattle";
		System.out.println("Result: " + Tasks4.toCamelCase(methodname));
		System.out.println("Result2: " + Tasks4.toSnakeCase(methodname2));
		
		System.out.println("Task 4");
		double[] work = {13.25, 15, 30, 1.5};
		System.out.println("Result: " + Tasks4.overTime(work));
		
		System.out.println("Task 5");
		String weight = "205 pounds";
		String height = "73 inches";
		System.out.println("Result: ");
		Tasks4.BMI(weight, height);
			
		System.out.println("Task 6");
		int digital3 = 10;
		System.out.println("Result: " + Tasks4.bugger(digital3));
		
		System.out.println("Task 7");
		String formule = "aaaabbb";
		System.out.println("Result: " + Tasks4.toStarShorthand(formule));
		
		System.out.println("Task 8");
		String slang = "Algebra is bool";
		String slang2 = "When it`s fOEl";
		System.out.println("Result: " + Tasks4.doesRhyme(slang, slang2)); 
		
		System.out.println("Task 9");
		double digit5 = 1222345;
		double digit6 = 12345;
		System.out.println("Result: " + Tasks4.trouble(digit5, digit6));
		
		System.out.println("Task 10");
		String books = "defgdhhhhhhd";
		char end = 'd';
		System.out.println("Result: " + Tasks4.countUniqueBooks(books, end));
		break;
		
		case 5:
		System.out.println("Task 1");
		String word1 = "Sunshine";
		int codes[] = new int[word1.length()];
		int codes2[] = {72, 33, -73 , 84, -12, -3, 13, -13, -68};
		System.out.println("Result: ");
		Tasks5.encrypt(word1);
		Tasks5.decrypt(codes2);
		
		System.out.println("Task 2");
		String figure = "Horse";
		String cell1 = "H8";
		String cell2 = "G7";
		System.out.println("Result: " + Tasks5.canMove(figure, cell1, cell2));
		
		System.out.println("Task 3");
		String word9 = "aulu";
		String word10 = "beautifulu";
		System.out.println("Result: " + Tasks5.canComplete(word9, word10));
		
		System.out.println("Task 4");
		int[] digits = {1, 2, 3, 4, 5, 6};
		System.out.println("Result: " + Tasks5.sumDigProd(digits));
		
		System.out.println("Task 5");
		String[] words1 = {"mother", "eran", "father", "sOnne", "Eons"};
		System.out.println("Result: "); 
		Tasks5.sameVowelGroup(words1);
		
		System.out.println("Task 6");
		long validatecode = 1234567890123452L;
		System.out.println("Result: " + Tasks5.validateCard(validatecode));
		
		System.out.println("Task 7");
		int number = 531;
		System.out.println("Result: " + Tasks5.numToEng(number));
		
		System.out.println("Task 8");
		String word11 = "a";
		System.out.println("Result: " + Tasks5.getSha256Has(word9));
		
		System.out.println("Task 9");
		String saying = "sansa stark, lady of winterfell.";
		System.out.println("Result: "); 
		Tasks5.correctTitle(saying);
		
		System.out.println("Task 10");
		int hexal = 127;
		System.out.println("Result: " + Tasks5.hexLattice(hexal));
		break;
		}
	}

}
