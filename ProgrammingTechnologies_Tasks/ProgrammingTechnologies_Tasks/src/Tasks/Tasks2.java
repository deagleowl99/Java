package Tasks;

public class Tasks2 {
	
	public static void repeat(char[] word, int digit)
	{
		
		for (int i=0; i<word.length; i++)
		{
			for (int j=0; j<digit; j++)
				System.out.print(Character.toString(word[i]));
		}
	}
	
	public static int differenceMaxMin(int[] array)
	{
		int max = 0, min = 0, maxi = 0;
		for (int i=0; i<array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
				maxi = i;
			}
		}
		min = array[maxi];
		for (int i=0; i<array.length; i++)
		{
			if (array[i] < min)
				min = array[i];
		}
		return max - min;
	}
	
	public static boolean isAvgWhole(double[] array)
	{
		int avg = 0;
		for (int i=0; i < array.length; i++)
		{
			avg += array[i];
		}
		if (avg % array.length == 0)
			return true;
		else
			return false;
	}
	
	public static void cumulativeSum(int[] array)
	{
		for (int i=0; i < array.length-1; i++)
		{
			array[i+1] = array[i+1] + array[i];
		}
		for (int i=0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}		
	}
	
	public static int getDecimalPlaces(String digital)
	{
		int quan = digital.length() - digital.indexOf(".") - 1;
		if (quan == digital.length())
			return 0;
		return quan;
	}
	
	public static int fibonacci(int n){
 
    		if (n == 0){
        		return 0;
    		}
    		if (n == 1){
        		return 1;
    		}
    		else{
        		return fibonacci(n - 1) + fibonacci(n - 2);
    		}
	}
	
	public static boolean isValid(String mail)
	{
		int letters = 0;
		for (int i=0; i < mail.length(); i++)
		{
		if (mail.length() <= 5 && mail.indexOf(" ") == -1 && ((int)mail.charAt(i) >= 48 && (int)mail.charAt(i) <= 57))
			letters++;
		}
		boolean b = letters == mail.length() ? true : false;
		return b;
	
	}
	
	public static boolean isStrangePair(String word1, String word2)
	{
		if (word1 == "" && word2 == "")
		{
			return true;
		}
		else
		{
			if (word1.charAt(0) == word2.charAt(word2.length()-1) && word1.charAt(word1.length()-1) == word2.charAt(0))
				return true;
			else
				return false;
		}
	}
	
	public static boolean isPrefix(String word1, String word2)
	{
		return word1.startsWith(word2.substring(0, word2.length()-1));
	}
	
	public static boolean isSuffix(String word1, String word2)
	{
		return word1.endsWith(word2.substring(1, word2.length()));
	}
	
	public static int boxSeq(int step)
	{
		if (step % 2 == 0)
			return step;
		else 
		{
			step += 2;
			return step;
		}
	}

}