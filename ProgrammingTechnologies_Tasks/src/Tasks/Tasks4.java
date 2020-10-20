package Tasks;

public class Tasks4 
{
	
	public static String bessie(int words, int characters, String text)
	{ 
		int character = 0;
        int space = 0;
        for (int i=0; i<text.length(); i++) 
        {
            if (text.charAt(i) != ' ') 
            {
                character++;
            }
            else 
            {
                space = i;
            }
            if (character > characters && space != 0) 
            {
                character = i - space;
                text = text.substring(0, space) + "\n" + text.substring(space+1, text.length());
            }
        }
        return text;
	}
	public static String split(String brackets)
	{
		String brackets1 = "[";
        int open = 0;
        int close = 0;
        for (int i=0; i<brackets.length(); i++) 
        {
            if (open == 0) 
            {
                brackets1 += "\"";
            }
            if (brackets.charAt(i) == '(') 
            {
                open++;
                brackets1 += '(';
            }
            else if (brackets.charAt(i) == ')') 
            {
                close++;
                brackets1 += ')';
            }
            if (open == close) 
            {
                brackets1 += "\"";
                if (i+1 != brackets.length()) 
                {
                    brackets1 += ", ";
                }
                open = 0;
                close = 0;
            }
        }
        brackets1 += "]";
        return brackets1;
	}
	
	public static String toCamelCase(String methodname)
	{	
		String method = "";
	        char c;
	        int i = 0;
	        while (i<methodname.length()) 
	        {
	            c = methodname.charAt(i);
	            if (c == '_') 
	            {
	                i++;
	                c = Character.toUpperCase(methodname.charAt(i));
	            }
	            method += c;
	            i++;
	        }
	        return method;
	}
	
	public static String toSnakeCase(String methodname)
	{	
		String method = "";
        char c;
        int i = 0;
        while (i<methodname.length()) 
        {
            c = methodname.charAt(i);
            if ((int)c >= 65 && (int)c <= 90) 
            {
                method += '_';
                c = Character.toLowerCase(c);
            }
            method += c;
            i++;
        }
        return method;
	}
	
	public static String overTime(double[] work)
	{
		String dollars = "$";
		double a = work[1] > 17 ? (17 - work[0]) * work[2] + (work[1] - 17) * work[2] * work[3]
				: (work[1] - work[0]) * work[2];
		dollars += String.format("%.2f", a);
		return dollars;
	}
	
	public static void BMI(String weight, String height)
	{
		String a = "";
		double weight2 = weight.endsWith("pounds") ? 0.453592 : 1;
		double height2 = height.endsWith("inches") ? 0.0254 : 1;
		double bmi = Double.parseDouble(weight.substring(0, weight.indexOf(' '))) * weight2 / 
				Math.pow(Double.parseDouble(height.substring(0, weight.indexOf(' '))) * height2, 2);
		if (bmi < 18.5)
			System.out.println(String.format("%.1f", bmi) + " Underweight");
		else if (bmi >= 18.5 && bmi <= 24.9)
			System.out.println(String.format("%.1f", bmi) + " Normal weight");
		else if (bmi >= 25)
			System.out.println(String.format("%.1f", bmi) + " Overweight");
	}
	
	public static int bugger(int digital) 
	{
		int a = 1, b = 0;
		String newcharital;
		String charital = Integer.toString(digital);
		while (charital.length() != 1)
		{
			for (int i=0; i<charital.length(); i++)
				a *= Integer.parseInt(charital.substring(i,i+1));
			charital = Integer.toString(a);
			b++;
			a = 1;
		}
		return b;
	}
	
	public static String toStarShorthand(String formule)
	{
		String primer = "";
        char first = (char) 0;
        int count = 0;
        for (int i = 0; i<formule.length(); i++) 
        {
            if (first != formule.charAt(i)) 
            {
                if (count > 1) 
                {
                    primer += "*" + count;
                }
                first = formule.charAt(i);
                primer += first;
                count = 1;
            }
            else 
            {
                count++;
                if (i == formule.length() - 1 && count > 1) 
                {
                    primer += "*" + count;
                }
            }
        }
        return primer;
	}
	
	public static boolean doesRhyme(String slang, String slang2)
	{
		String newslang = "", newslang2 = "";
		int a = slang.lastIndexOf(" ");
		int b = slang2.lastIndexOf(" ");
		for (int i=a; i<slang.length(); i++)
		{
			if (slang.charAt(i) == 'a' || slang.charAt(i) == 'e' || slang.charAt(i) == 'i' || slang.charAt(i) == 'o' ||
					slang.charAt(i) == 'u' || slang.charAt(i) == 'y' || slang.charAt(i) == 'A' || slang.charAt(i) == 'E'
					|| slang.charAt(i) == 'I' || slang.charAt(i) == 'O' || slang.charAt(i) == 'U' || slang.charAt(i) == 'Y')
				newslang += Character.toString(slang.charAt(i));
		}
		for (int i=b; i<slang2.length(); i++)
		{
			if (slang2.charAt(i) == 'a' || slang2.charAt(i) == 'e' || slang2.charAt(i) == 'i' || slang2.charAt(i) == 'o' ||
					slang2.charAt(i) == 'u' || slang2.charAt(i) == 'y' || slang2.charAt(i) == 'A' || slang2.charAt(i) == 'E'
					|| slang2.charAt(i) == 'I' || slang2.charAt(i) == 'O' || slang2.charAt(i) == 'U' || slang2.charAt(i) == 'Y')
				newslang2 += Character.toString(slang2.charAt(i));
		}
		boolean b1 = newslang.equalsIgnoreCase(newslang2) ? true : false;
		return b1;
	}
	
	public static boolean trouble(double digital1, double digital2)
	{
		int a = 1;
		char b = 'd';
		char c = 'e';
		String charital1 = Double.toString(digital1);
		String charital2 = Double.toString(digital2);
		for (int i=0; i<Double.toString(digital1).length()-2; i++)
		{
			if (charital1.charAt(i) == charital1.charAt(i+1) && charital1.charAt(i+1) == charital1.charAt(i+2))
				 b = charital1.charAt(i);
		}
		for (int i=0; i<Double.toString(digital2).length()-1; i++)
		{
			if (charital1.charAt(i) == charital1.charAt(i+1) && charital1.charAt(i) == b)
				 a = charital1.charAt(i);
		}
		boolean d = a == b ? true : false;
		return d;

	}
	
	public static int countUniqueBooks(String books, char end)
	{
		int start = -1; 
		int end2 = -1; 
		int i, j; 
		int count = 0;
        String temp, test;
        for (i=0; i<books.length(); i++) 
        {
            if (books.charAt(i) == end) 
            {
                if (start == -1) 
                {
                    start = i;
                }
                else 
                {
                    end2 = i;
                }
            }
            if (start != -1 && end2 != -1) 
            {
                test = books.substring(start+1, end2);
                temp = "";
                for (j = 0; j < test.length(); j++)
                {
                    char current = test.charAt(j);
                    if (temp.indexOf(current) < 0)
                    {
                        temp = temp + current;
                    }
                }
                count += temp.length();
                start = -1;
                end2 = -1;
            }
        }
        return count;
	}
}
