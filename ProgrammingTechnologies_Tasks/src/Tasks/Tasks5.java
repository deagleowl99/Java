package Tasks;
import java.security.MessageDigest;
import java.util.*;
public class Tasks5 
{
	public static void encrypt(String word)
	{
		int[] codes = new int[word.length()];
		codes[0] = (int)word.charAt(0);
		System.out.print(codes[0] + " ");
		for (int i=1; i<word.length(); i++)
		{
			codes[i] = (int)word.charAt(i-1) - (int)word.charAt(i);
			System.out.print(-codes[i] + " ");
		}
		System.out.println();
	}
	
	public static void decrypt(int[] codes)
	{
		int a = 0;
		for (int i=0; i<codes.length; i++)
		{
			a += codes[i];
			System.out.print((char)a);
		}
		System.out.println();
	}
	
	public static boolean canMove(String figure, String cell1, String cell2)
	{
		if (figure == "Pawn")
		{
			if (cell1.charAt(0) == cell2.charAt(0) && Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1)) == 1)
				return true;
			else return false;
		}
		else if (figure == "Rook")
		{
			if (cell1.charAt(0) == cell2.charAt(0) || cell1.charAt(1) == cell2.charAt(1))
				return true;
			return false;
		}
		else if (figure == "King")
		{
			if (Math.abs((int)cell1.charAt(0) - (int)cell2.charAt(0)) <= 1 && 
					Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1)) <= 1)
				return true;
			else
				return false;
		}
		else if (figure == "Bishop")
		{
			if (Math.abs((int)cell1.charAt(0) - (int)cell2.charAt(0)) ==
					Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1)))
				return true;
			else return false;
		}
		else if (figure == "Queen")
		{
			if ((cell1.charAt(0) == cell2.charAt(0) || cell1.charAt(1) == cell2.charAt(1) ||
					Math.abs((int)cell1.charAt(0) - (int)cell2.charAt(0)) ==
					Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1))))
				return true;
			else return false;
		}
		else if (figure == "Horse")
		{
			if ((Math.abs((int)cell1.charAt(0) - (int)cell2.charAt(0)) == 1 &&  
					(Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1)) == 2)) ||
					(Math.abs((int)cell1.charAt(0) - (int)cell2.charAt(0)) == 2 &&  
					(Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1)) == 1)))
				return true;
			else return false;
		}
		return false;
	}
	
	public static boolean canComplete(String word1, String word2)
	{
		String word3 = "";
		int count = 0;
		for (int i=0; i<word1.length(); i++)
		{
			word3 += word2.indexOf(word1.charAt(i));		
		}

		for (int i=0; i<word3.length()-1; i++)
		{
			if (word3.indexOf("-1") == -1)
			{	if ((int)(word3.charAt(i)) < (int)(word3.charAt(i+1)))
					count++;
				else if ((int)(word3.charAt(i)) > (int)(word3.charAt(i+1)))
				{
					if (word2.indexOf(word1.charAt(i+1)) < word2.lastIndexOf(word1.charAt(i+1)))
						count++;
				}
			}
			else return false;
		}
		boolean b = count + 1 == word3.length() ? true : false;
		return b;
	}
	
	public static String sumDigProd(int digits[])
	{
		int a = 0;
		int p = 1;		
		for (int i=0; i<digits.length; i++)
		{
			a += digits[i];
		}
		String charital = Integer.toString(a);
		while (charital.length() != 1)
		{			
			for (int i=0; i<charital.length(); i++)
				p *= Integer.parseInt(charital.substring(i,i+1));
			charital = Integer.toString(p);
			p = 1;
		}
		return charital;
	}
	
	public static void sameVowelGroup(String[] words)
	{
		int a, e, i, o, u, y;
		String[] vowels = new String[words.length];
		a = 0; e = 0; i = 0; o = 0; u = 0; y = 0;
	    for (int i1=0; i1<words.length; i1++)
	    {	    	
	    	for (int j = 0; j<words[i1].length(); j++) 
		    {	    		
		        if (words[i1].charAt(j) == 'a' || words[i1].charAt(j) == 'A') 
		        {
		            a = 1;
		        } 
		        else if (words[i1].charAt(j) == 'e' || words[i1].charAt(j) == 'E') 
		        {
		            e = 1;
		        } 
		        else if (words[i1].charAt(j) == 'i' || words[i1].charAt(j) == 'I') 
		        {
		            i = 1;
		        } 
		        else if (words[i1].charAt(j) == 'o' || words[i1].charAt(j) == 'O') 
		        {
		            o = 1;
		        } 
		        else if (words[i1].charAt(j) == 'u' || words[i1].charAt(j) == 'U') 
		        {
		            u = 1;
		        }
		        else if (words[i1].charAt(j) == 'y' || words[i1].charAt(j) == 'Y') 
		        {
		            y = 1;
		        }
		        vowels[i1] = Integer.toString(a) + Integer.toString(e) + Integer.toString(i) +
		        		Integer.toString(o) + Integer.toString(u) + Integer.toString(y);		        
		    }
	    	a = 0; e = 0; i = 0; o = 0; u = 0; y = 0;
	    }
	    for (int i1 = 0; i1<words.length; i1++)
	    {
	    	if (vowels[0].equals(vowels[i1]))
	    		System.out.print(words[i1] + " ");
	    }
	    System.out.println();
	}
	
	public static boolean validateCard(long cardcode)
	{
		String code2 = "";
		String code = Long.toString(cardcode);
		code2 = code.substring(0, code.length()-1);
		String reversecode = "";
		String reversecode2 = "";
		int a = 0;
		int sum = 0;
		int controlsum = 0;
		if (code.length() >= 14 && code.length() <= 19)
		{
			for (int i=code2.length(); i>0; i--)
			{
				reversecode += code2.substring(i-1, i);
			}
			for (int i=0; i<reversecode.length(); i++)
			{
				if (i % 2 == 0)
				{
					a = ((int)reversecode.charAt(i) - 48) * 2;
					if (a >= 10)
						a = (int)Integer.toString(a).charAt(0) + (int)Integer.toString(a).charAt(1) - 96;
					reversecode2 += Integer.toString(a);
				}
				else if (i % 2 == 1)
				{
					a = ((int)reversecode.charAt(i) - 48);
					reversecode2 += Integer.toString(a);
				}
				sum += a;
		}	
			controlsum = 10 - (int)Integer.toString(sum).charAt(Integer.toString(sum).length()-1) + 48;
			boolean b = controlsum == (int)code.charAt(code.length()-1) - 48 ? true : false;
			return b;
		}
		else return false;
	}
	
	public static String numToEng(int number)
	{
		String[] ones = {"zero", "one", "two", "three", "four", "five", "six",
				"seven", "eight", "nine"};
		String[] ones2 = {" ", "one", "two", "three", "four", "five", "six",
				"seven", "eight", "nine"};
		String[] tenprefixes = {"ten", "eleven", "twelve", "thir", "four", "fif", "six",
				"seven", "eight", "nine"};
		String[] tenprefixes2 = {"ten", "eleven", "twen", "thir", "for", "fif", "six",
				"seven", "eight", "nine"};
		String[] tensuffixes = {"ten", "eleven", "twelve", "teen", "teen", "teen", "teen",
				"teen", "een", "teen"};
		String[] tens = {"ten", "twenty", "ty", "ty", "ty", "ty", "ty", "ty", "ty", "ty"};
		if (Integer.toString(number).length() == 1)
			return ones[number];
		else if (Integer.toString(number).length() == 2)
		{
			if ((int)Integer.toString(number).charAt(0) == 48)
				return "Wrong number format";
			else if (Integer.toString(number).charAt(0) == '1' && (int)Integer.toString(number).charAt(1) >= 48
					&& (int)Integer.toString(number).charAt(1) <= 50)
				return tenprefixes[number % 10];
			else if (Integer.toString(number).charAt(0) == '1' && (int)Integer.toString(number).charAt(1) >= 51
					&& (int)Integer.toString(number).charAt(1) <= 57)
				return tenprefixes[number % 10] + tensuffixes[number % 10];
			else return tenprefixes2[number / 10] + tens[number / 10] + " " + ones2[number % 10];
		}
		 if (Integer.toString(number).length() == 3)
		{
			if ((int)Integer.toString(number).charAt(0) == 48)
				return "Wrong number format";
			else if (Integer.toString(number).charAt(1) == '0')
				return ones[number / 100] + " hundred " + ones2[number % 100];
			else if (Integer.toString(number).charAt(1) == '1' && (int)Integer.toString(number).charAt(2) >= 48
					&& (int)Integer.toString(number).charAt(2) <= 50)
				return ones[number / 100] + " hundred " + tenprefixes[number % 100 % 10];
			else if (Integer.toString(number).charAt(1) == '1' && (int)Integer.toString(number).charAt(2) >= 51
					&& (int)Integer.toString(number).charAt(2) <= 57)
				return ones[number / 100] + " hundred " + tenprefixes[number % 100 % 10] +
						tensuffixes[number % 100 % 10];
			else return ones[number / 100] + " hundred " + tenprefixes2[number / 10 % 10] +
					tens[number / 10 % 10] + " " + ones2[number % 100 % 10];
		}
		else return "Wrong number format";
	}
	public static String getSha256Has(String base) 
	{
		try{
	        MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        byte[] hash = digest.digest(base.getBytes("UTF-8"));
	        StringBuffer hexString = new StringBuffer();

	        for (int i = 0; i < hash.length; i++) {
	            String hex = Integer.toHexString(0xff & hash[i]);
	            if(hex.length() == 1) hexString.append('0');
	            hexString.append(hex);
	        }

	        return hexString.toString();
	    } catch(Exception ex){
	       throw new RuntimeException(ex);
	    }
	}
		
	public static void correctTitle(String saying)
	{
		int j = 0;
		String[] sayingarray = saying.split("\\s+");
		
		for (String word : sayingarray) 
		{
			if (word.equalsIgnoreCase("and") || word.equalsIgnoreCase("in") ||
					word.equalsIgnoreCase("of") || word.equalsIgnoreCase("the"))
				System.out.print(word.toLowerCase() + " ");
			else
				System.out.print(Character.toString(word.charAt(0)).toUpperCase() + 
						word.substring(1, word.length()).toLowerCase() + " ");
		}
		System.out.println();
	}
	public static boolean hexLattice(int digit)
	{
		int a = 1;
		int b = 6;
		while (digit > a)
		{
			a += b;
			b += 6;
		}
		boolean c = digit == a ? true : false;
		return c;
	}
}
