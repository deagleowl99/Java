package Tasks;

public class Tasks3 {
	
	public static void solutions(int a, int b, int c)
	{
		if (b*b-4*a*c > 0)
			System.out.println(a + "x2" + "+" + b + "x" + "+" + c + " has two solutions");
		else if (b*b-4*a*c == 0)
			System.out.println(a + "x2" + "+" + b + "x" + "+" + c + " has one solution");
		else if (b*b-4*a*c < 0)
			System.out.println(a + "x2" + "+" + b + "x" + "+" + c + " has no solutions");
	}
	
	public static int findZip(String sentence)
	{
		int n = 2;
		int pos = sentence.indexOf("zip");
		while (--n > 0 && pos != -1)
		{
			pos = sentence.indexOf("zip", pos + 1);
		}
		return pos;
	}
	
	public static boolean checkPerfect(int digit)
	{
		int sum = 0;
		for (int i=1; i<=digit/2; i++)
		{
			if (digit % i == 0)
				sum += i;
		}
		boolean b = sum == digit ? true : false;
		return b;
	}
	
	public static void flipAndChars(String pair)
	{
		char let1, let2;
		if (pair.length() < 2)
			System.out.println("Nesovmestimo");
		else if (pair.charAt(0) == pair.charAt(pair.length()-1))
			System.out.println("Two`s a pair");
		else 
		{
			let1 = pair.charAt(0); 
			let2 = pair.charAt(pair.length()-1);
			System.out.println(let2 + pair.substring(1, pair.length()-1) + let1);
		}
	}
	
	public static boolean isValidHexCode(String code)
	{
		int letters = 0;
		for (int i=0; i < code.length(); i++)
		{
		if ((code.length() == 7 && code.charAt(0) == '#' && ((int)code.charAt(i) == 35 || ((int)code.charAt(i) >= 48) && 
				(int)code.charAt(i) <= 57)) || ((int)code.charAt(i) >= 65 && (int)code.charAt(i) <= 70) || 
				((int)code.charAt(i) >= 97 && (int)code.charAt(i) <= 102))
			letters++;
		}
		boolean b = letters == 7 ? true : false;
		return b;
	}
	
	public static boolean same(int[] array, int[] array1)
	{
		int result = 0, result1 = 0;
	    int countUnique = 0, countUnique1 = 0;
	    int count = 0, count1 = 0;
	    for (int i = 0; i < array.length; i++) {
	        countUnique++;
	        for (int j = i + 1; j < array.length; j++) {
	            if (array[j] == array[i]) {
	                count++;
	            }
	        }
	    }
	    result = countUnique - count;
	    
	    for (int i = 0; i < array1.length; i++) {
	        countUnique1++;
	        for (int j = i + 1; j < array1.length; j++) {
	            if (array1[j] == array1[i]) {
	                count1++;
	            }
	        }
	    }
	    result1 = countUnique1 - count1;
	    boolean b = result == result1 ? true : false;
	    return b;
	    
	}
	
	public static boolean isKaprekar(int digit)
	{
		int digit2 = 1, digit3 = 0, digit4 = 0;
		int digit1 = digit * digit;
		while (digit1 >= 10)
		{
			digit1 /= 10;
			digit2++;
		}
		System.out.println(digit2);
		digit1 = digit * digit;
		System.out.println(String.valueOf(digit1).substring(0, digit2 / 2) + " " + String.valueOf(digit1).substring(digit2 / 2, digit2));
		digit3 = Integer.parseInt(String.valueOf(digit1).substring(0, digit2 / 2));
		digit4 = Integer.parseInt(String.valueOf(digit1).substring(digit2 / 2, digit2));
		boolean b = digit3 + digit4 == digit ? true : false;
		return b;
	}
	
	public static void longestZero(String binary)
	{
		StringBuilder stringInput = new StringBuilder();
		int length = 0;
		int maxLength = 0;
		for (int i = 0; i < binary.length(); i++) {
			stringInput = stringInput.append(binary.charAt(i));
		        if (binary.charAt(i) == '0') {
		            length++;
		        }
		        if (binary.charAt(i) != '0') {
		            length = 0;
		        }
		        maxLength = Math.max(maxLength, length);
		    }
		    System.out.println(maxLength);
	}
	
	public static int nextPrime(int prime) 
	{
		int count = 0;
		for (int i=2; i<prime; i++) 
		{
            if (prime % i == 0) 	
            	count++;       
        }
		if (count == 0)
			return prime;
		else
		{
	    boolean isPrime = false;
	    int start = 2; 
	    while (!isPrime) 
	    {
	        prime += 1;
	        int m = (int) Math.ceil(Math.sqrt(prime));
	        isPrime = true;
	        for (int i = start; i <= m; i++) 
	        {
	            if (prime % i == 0) 
	            {
	                isPrime = false;
	                break;
	            } 
	        }
	    }
		}
	    return prime;
	}
	
	public static boolean rightTriangle(int side1, int side2, int side3)
	{
		int min = 0, medium = 0, max = 0;
		if (side1 < side2 && side1 < side3 && side2 < side3)
		{
			min = side1;
			medium = side2;
			max = side3;
		}
		else if (side2 < side1 && side2 < side3 && side1 < side3)
		{
			min = side2;
			medium = side1;
			max = side3;
		}
		else if (side3 < side2 && side3 < side1 && side2 < side1)
		{
			min = side3;
			medium = side2;
			max = side1;
		}
		else if (side2 < side1 && side2 < side3 && side3 < side1)
		{
			min = side2;
			medium = side3;
			max = side1;
		}
		else if (side3 < side2 && side3 < side1 && side2 < side1)
		{
			min = side3;
			medium = side2;
			max = side1;
		}
		else if (side3 < side1 && side3 < side2 && side2 < side1)
		{
			min = side3;
			medium = side1;
			max = side2;
		}	
		boolean b = min * min + medium * medium == max * max ? true : false;
		return b;		
	}

}
