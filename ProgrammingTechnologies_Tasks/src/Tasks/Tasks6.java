package Tasks;
import java.util.*;
public class Tasks6 
{
	public static int fact(int n)
	{
		int res = 1;
		for (int i=1; i<=n; i++)
		{
			res *= i;
		}
		return res;
	}
	public static int bell(int digit)
	{
		int[] s = new int[digit + 1];            
        int prev = 1;
        for(int i = 1; i <= digit; i++) 
        {                
            for(int j = 1; j <= digit; j++) 
            {                 
                int t = s[j];     
                s[j] = prev + j * s[j];
                prev = t;                          
            }
            prev = 0;                   
        }
        int result = prev;
        for(int i = 0; i <= digit; i++) 
            result += s[i];
        return result;
	}
	
	public static String translateWord(String word)
	{

	    if (word.endsWith(",") || word.endsWith("?") || word.endsWith(".") ||
				  word.endsWith(":") ||	word.endsWith(";") || word.endsWith("!"))
		{
			if ((word.substring(0,1).equalsIgnoreCase("a") || word.substring(0,1).equalsIgnoreCase("e") ||
					word.substring(0,1).equalsIgnoreCase("i") || word.substring(0,1).equalsIgnoreCase("o") ||
					word.substring(0,1).equalsIgnoreCase("u") || word.substring(0,1).equalsIgnoreCase("y")))
			return word.substring(0, word.length() - 1) + "yay" + word.charAt(word.length() - 1);
			else
			{				
				if ((int)word.charAt(0) >= 65 && (int)word.charAt(0) <= 90)
				{
					for (int i=0; i<word.length(); i++)
					{
						if (Character.toString(word.charAt(i)).equalsIgnoreCase("a") ||
								Character.toString(word.charAt(i)).equalsIgnoreCase("e") ||
								Character.toString(word.charAt(i)).equalsIgnoreCase("i") ||
								Character.toString(word.charAt(i)).equalsIgnoreCase("o") ||
								Character.toString(word.charAt(i)).equalsIgnoreCase("u") ||
								Character.toString(word.charAt(i)).equalsIgnoreCase("y"))
							return Character.toString(word.charAt(word.indexOf(word.charAt(i)))).toUpperCase() + 
									(word.substring(word.indexOf(word.charAt(i)) + 1, word.length() - 1) + 
									word.substring(0, word.indexOf(word.charAt(i))) + "ay" +
									word.charAt(word.length() - 1)).toLowerCase();
					}
				}
				else
				{
				for (int i=0; i<word.length(); i++)
				{
					if (Character.toString(word.charAt(i)).equalsIgnoreCase("a") ||
							Character.toString(word.charAt(i)).equalsIgnoreCase("e") ||
							Character.toString(word.charAt(i)).equalsIgnoreCase("i") ||
							Character.toString(word.charAt(i)).equalsIgnoreCase("o") ||
							Character.toString(word.charAt(i)).equalsIgnoreCase("u") ||
							Character.toString(word.charAt(i)).equalsIgnoreCase("y"))
						return word.substring(word.indexOf(word.charAt(i)), word.length() - 1) + 
								word.substring(0, word.indexOf(word.charAt(i))) + "ay" +
								word.charAt(word.length() - 1);
				}
				}
			}
		}
		else
		{
		 if ((word.substring(0,1).equalsIgnoreCase("a") || word.substring(0,1).equalsIgnoreCase("e") ||
				word.substring(0,1).equalsIgnoreCase("i") || word.substring(0,1).equalsIgnoreCase("o") ||
				word.substring(0,1).equalsIgnoreCase("u") || word.substring(0,1).equalsIgnoreCase("y")))
			return word + "yay";
		else
		{	
			if ((int)word.charAt(0) >= 65 && (int)word.charAt(0) <= 90)
			{
				for (int i=0; i<word.length(); i++)
				{
					if (Character.toString(word.charAt(i)).equalsIgnoreCase("a") ||
							Character.toString(word.charAt(i)).equalsIgnoreCase("e") ||
							Character.toString(word.charAt(i)).equalsIgnoreCase("i") ||
							Character.toString(word.charAt(i)).equalsIgnoreCase("o") ||
							Character.toString(word.charAt(i)).equalsIgnoreCase("u") ||
							Character.toString(word.charAt(i)).equalsIgnoreCase("y"))
						return Character.toString(word.charAt(i)).toUpperCase() + 
								(word.substring(word.indexOf(word.charAt(i)) + 1) + 
								word.substring(0, word.indexOf(word.charAt(i))) + "ay").toLowerCase();
				}
			}
			else
			{
			for (int i=0; i<word.length(); i++)
			{
				if (Character.toString(word.charAt(i)).equalsIgnoreCase("a") ||
						Character.toString(word.charAt(i)).equalsIgnoreCase("e") ||
						Character.toString(word.charAt(i)).equalsIgnoreCase("i") ||
						Character.toString(word.charAt(i)).equalsIgnoreCase("o") ||
						Character.toString(word.charAt(i)).equalsIgnoreCase("u") ||
						Character.toString(word.charAt(i)).equalsIgnoreCase("y"))
					return word.substring(word.indexOf(word.charAt(i))) + 
							word.substring(0, word.indexOf(word.charAt(i))) + "ay";
			}
			}
			
		}
		}
		return "";
	}
	
	public static void translateSentence(String text)
	{
		String[] textarray = text.split("\\s+");
		
		for (String word : textarray) 
		{
			System.out.print(translateWord(word) + " ");
		}
		System.out.println();
	}
	
	public static boolean validColor(String rgbstring)
	{	
		String newrgb = "";
		String newrgb1 = "";
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		if (rgbstring.startsWith("rgb") && !rgbstring.contains("%"))
		{
			if (rgbstring.startsWith("rgb(") && rgbstring.endsWith(")") && 
					!rgbstring.contains("."))
			{
				newrgb = rgbstring.substring(4, rgbstring.length() - 1);

				String[] rgbarray = newrgb.split(",");
				for (String word : rgbarray)
				{
					char[] charray = word.toCharArray();
					for (char c : charray)
					{
						if (c < '0' || c > '9')
							return false;
					}
					if (Integer.parseInt(word) >= 0 && Integer.parseInt(word) <= 255)
					{
						count++;
					}
					else return false;
				}
				boolean b = count == 3 ? true : false;
				return b;				
			}
			else if (rgbstring.startsWith("rgba(") && rgbstring.endsWith(")"))
			{
				newrgb1 = rgbstring.substring(5, rgbstring.length() - 1);
				String[] rgbarray1 = newrgb1.split(",");
				int i = 0;
				for (String word : rgbarray1)
				{										
					if (i >= 0 && i <= 2)
					{
						char[] charray = word.toCharArray();
						for (char c : charray)
						{
							if (c < '0' || c > '9')
								return false;
						}
						if (Integer.parseInt(word) >= 0 && Integer.parseInt(word) <= 255)
						{
							count1++;
						}
					}	
					else 
					{
						if (word.equals("0") || word.equals("0.5") || word.equals("1"))
							count1++;
					}					
					i++;
				}
				boolean b = count1 == 4 ? true : false;
				return b;
			}
			else return false;
		}
		else return false;
	}
	
	public static void stripUrlParams(String url)
	{
		if (url.endsWith("?"))
			System.out.println(url);
		else
		{
		String params = "";
		String beforecom = url.substring(0, url.lastIndexOf("com") + 4);
		String aftercom = url.substring(url.lastIndexOf("com?") + 4, 
				url.length());
		String[] paramstrings = aftercom.split("&");
		String charstring = "";
		for (String word : paramstrings)
		{
			charstring += word.charAt(0);
		}
		StringBuilder newcharstring = new StringBuilder();
		Set<Character> set = new HashSet<>();
		for (char c : charstring.toCharArray())
		{
			if (!set.contains(c))
			{
				newcharstring.append(c);
				set.add(c);
			}
		}
		for (int i=0; i<newcharstring.toString().length(); i++)
		{
			beforecom += paramstrings[charstring.lastIndexOf(newcharstring.toString().charAt(i))] + "&";
		}
		System.out.println(beforecom.substring(0, beforecom.length()-1));
		}
	}
	public static void stripUrlParams(String url, String[] paramsToStrip)
	{
		if (url.endsWith("?"))
			System.out.println(url);
		else
		{
		String params = "";
		for (String word : paramsToStrip)
		{
			params += word;
		}
		String beforecom = url.substring(0, url.lastIndexOf("com") + 4);
		String aftercom = url.substring(url.lastIndexOf("com?") + 4, 
				url.length());
		String[] paramstrings = aftercom.split("&");
		String charstring = "";
		for (String word : paramstrings)
		{
			charstring += word.charAt(0);
		}
		System.out.println(charstring);
		StringBuilder newcharstring = new StringBuilder();
		Set<Character> set = new HashSet<>();
		for (char c : charstring.toCharArray())
		{
			if (!set.contains(c))
			{
				newcharstring.append(c);
				set.add(c);
			}
		}
		System.out.println(newcharstring.toString());
		for (int i=0; i<newcharstring.toString().length(); i++)
		{
			if (params.indexOf(paramstrings[charstring.lastIndexOf(newcharstring.toString().charAt(i))].substring(0,1)) >= 0)
				paramstrings[charstring.lastIndexOf(newcharstring.toString().charAt(i))] = "";
			else
			beforecom += paramstrings[charstring.lastIndexOf(newcharstring.toString().charAt(i))] + "&";
		}
		System.out.println(beforecom.substring(0, beforecom.length()-1));
		}
	}
	
	public static void getHashTags (String title)
	{
		int count = 0;
		int i = 0;
		String[] titlearray = title.split("\\s+");
		for (String word : titlearray)
		{
			count++;
		}
		int[] lengths = new int[count];
		if (count == 1)
			System.out.println("#" + title);
		else if (count == 2)
		{
			int length1 = titlearray[0].length();
			int length2 = titlearray[1].length();
			if (length1 < length2)
				System.out.println("#" + titlearray[1] + " " + "#" + titlearray[0]);
			else if (length1 > length2)
				System.out.println("#" + titlearray[0] + " " + "#" + titlearray[1]);
			else if (length1 == length2)
				System.out.println("#" + titlearray[0]);
		}
		else
		{
		for (String word : titlearray)
		{
			if (word.endsWith(",") || word.endsWith("!") || 
					word.endsWith(".") || word.endsWith("?") ||
					word.endsWith(":") || word.endsWith(";"))
				word = word.substring(0, word.length() - 1);
			lengths[i] = word.length();
			i++;
		}
		}
		int length3 = 0, i3 = 0;
		int length4 = 0, i4 = 0;
		int length5 = 0, i5 = 0;
		for (i=0; i<lengths.length; i++)
		{
			if (lengths[i] > length3)
			{
				length3 = lengths[i];
				i3 = i;
			}
		}
		for (i=0; i<lengths.length; i++)
		{
			if (lengths[i] == length3)
			{
				lengths[i] = 0;
			}
		}
		lengths[i3] = 0;		
		for (i=0; i<lengths.length; i++)
		{
			if (lengths[i] > length4)
			{
				length4 = lengths[i];
				i4 = i;
			}
		}
		for (i=0; i<lengths.length; i++)
		{
			if (lengths[i] == length4)
			{
				lengths[i] = 0;
			}
		}
		lengths[i4] = 0;
		for (i=0; i<lengths.length; i++)
		{
			if (lengths[i] > length5)
			{
				length5 = lengths[i];
				i5 = i;
			}
		}

		System.out.println("#" + titlearray[i3] + " " + "#" + titlearray[i4] + " " + 
		"#" + titlearray[i5]);
	}
	
	public static int ulam(int ulamdigit)
	{
		Vector<Integer> ulamarr = new Vector<Integer>();
		ulamarr.add(1);
		ulamarr.add(2);
		for (int i=3; i < 10000; i++)
		{
			int count = 0;
			for (int j=0; j<ulamarr.size(); j++)
			{
				for (int k = j + 1; k<ulamarr.size(); k++)
				{
					if (ulamarr.get(j) + ulamarr.get(k) == i)
						count++;
					if (count > 1)
						break;
				}
					if (count > 1)
						break;				
			}
			if (count == 1)
			{
				ulamarr.add(i);
			}
		}
			return ulamarr.get(ulamdigit-1);
		}
	
	public static String longestNonrepeatingSubstring(String word)
	{
		Map<Character, Integer> unic = new HashMap<>();
		String word1 = "";
		for (int i=0, i1 = 0; i1 < word.length(); i1++)
		{
			char charital = word.charAt(i1);
			if (unic.containsKey(charital))
			{
				i = Math.max(unic.get(charital)+1, i);				
			}
			if (word1.length() < i1 - i + 1)
			{
				word1 = word.substring(i, i1 + 1);
			}
			unic.put(charital, i1);
		}
		return word1;
	}
	
	public static String convertToRoman(int input)
	{
		String s= "";
		if (input >=1 && input <= 3999)
		{
			while (input >= 1000) 
			{
		        s += "M";
		        input -= 1000;        
		    }
		    while (input >= 900) 
		    {
		        s += "CM";
		        input -= 900;
		    }
		    while (input >= 500) 
		    {
		        s += "D";
		        input -= 500;
		    }
		    while (input >= 400) 
		    {
		        s += "CD";
		        input -= 400;
		    }
		    while (input >= 100) 
		    {
		        s += "C";
		        input -= 100;
		    }
		    while (input >= 90) 
		    {
		        s += "XC";
		        input -= 90;
		    }
		    while (input >= 50) 
		    {
		        s += "L";
		        input -= 50;
		    }
		    while (input >= 40) 
		    {
		        s += "XL";
		        input -= 40;
		    }
		    while (input >= 10) 
		    {
		        s += "X";
		        input -= 10;
		    }
		    while (input >= 9) 
		    {
		        s += "IX";
		        input -= 9;
		    }
		    while (input >= 5) 
		    {
		        s += "V";
		        input -= 5;
		    }
		    while (input >= 4) 
		    {
		        s += "IV";
		        input -= 4;
		    }
		    while (input >= 1) 
		    {
		        s += "I";
		        input -= 1;
		    }    
		    return s;			
		}
		else return "Wrong number format";
	}
	
	public static boolean formula(String formul)
	{
		if (formul.contains("=") &&  (formul.contains("+") || formul.contains("-") ||
				formul.contains("*") || formul.contains("/") ||
				formul.contains("%")))
		{
			String[] formularray = formul.split("\\s+");
			String formul1 = "";
			String firstnumber = "";
			String secondnumber = "";
			String thirdnumber = "";
			String words[] = new String[5];
			int i1 = 0;
			for (String word : formularray) 
			{
				formul1 += word;
				words[i1] = word;
				if (words[1] != "+" || words[1] != "-" || words[1] != "*" || words[1] != "/" ||
						words[1] != "%")
					return false;
				i1++;
			}
			if (words[1] != "+" || words[1] != "-" || words[1] != "*" || words[1] != "/" ||
					words[1] != "%")
				return false;
			else
			{
			int i = 0;
			while (formul1.charAt(i) >= 48 && formul1.charAt(i) <= 57)
			{
				firstnumber += formul1.charAt(i);
				i++;
			}
			secondnumber = formul1.substring(i+1, formul1.indexOf("="));
			thirdnumber = formul1.substring(formul1.indexOf("=") + 1, formul1.length());
			int a = Integer.parseInt(firstnumber);
			int b = Integer.parseInt(secondnumber);
			int c = Integer.parseInt(thirdnumber);
			if (formul.contains("+"))
			{
				boolean d = a + b == c ? true : false;
				return d;
			}
			else if (formul1.contains("-"))
			{
				boolean d = a - b == c ? true : false;
				return d;
			}
			else if (formul1.contains("*"))
			{
				boolean d = a * b == c ? true : false;
				return d;
			}
			else if (formul1.contains("/"))
			{
				boolean d = a / b == c ? true : false;
				return d;
			}
			else if (formul1.contains("%"))
			{
				boolean d = a % b == c ? true : false;
				return d;
			}
			else return false;
			}
		}
		else return false;
	}
	
	public static boolean palindromeDescendant(int digit)
	{
		String digital = Integer.toString(digit);
		String newdigital = "";
		int[] sums = new int[digital.length() + 100];
		int j = 0;
		String newsum1 = "";
		String newsum = "";
		for (int i=digital.length()-1; i>=0; i--)
		{
			newdigital += digital.charAt(i);
		}
		if (digital.length() % 2 == 1)
		{			
			if (newdigital.equals(digital))			
				return true;
			else
				return false;			
		}
		else
		{
			for (j=0; j<digital.length() / 2; j++)
			{
			for (int i=0; i<digital.length(); i+=2)
			{
				sums[j] = (int)digital.charAt(i) + (int)digital.charAt(i+1) - 96;
				newsum += Integer.toString(sums[j]);
			}
			newsum1 += newsum + " ";
			digital = newsum;
			newsum = "";
			}
		}
		String[] newsum2 = newsum1.split("\\s+");
		int count = 0;
		for (String word: newsum2)
		{
			if (word.length() % 2 == 1)
			{
			if ((word.substring(0, word.length() / 2).equals(word.substring(word.length() / 2 + 1, word.length()))))
			{
				count++;
			}
			if (word.length() == 2)
			{
				if (word.charAt(0) == word.charAt(1))
				{
					count++;
				}
				else
				{
					if (((int)word.charAt(0) + (int)word.charAt(1) - 96) == 11)
					{
						count++;
					}						
				}
			}
		}
		else
		{
			if ((word.substring(0, word.length() / 2).equals(word.substring(word.length() / 2, word.length()))))
			{
				count++;
			}
		}
		}
		boolean b = count > 0 ? true : false;
		return b;
	}
	

}
