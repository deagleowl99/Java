package Tasks;

public class Tasks1 {
	
		public static int remainder(int a, int b)
		{
			return a % b;
		}
		
		public static double triArea(double side, double height)
		{
			return 0.5 * (side * height);
		}
		
		public static int animals(int chickens, int cows, int pigs)
		{
			return chickens * 2 + cows * 4 + pigs * 4;
		}
		
		public static boolean profitableGamble(double prob, int prize, int pay)
		{
			boolean b = prob * prize > pay ? true : false;
			return b;
		}
		
		public static String operation(int a1, int b1, int c1)
		{
			if (a1 + b1 == c1)
				return "added";
			
			else if (Math.abs(a1 - b1) == c1)
				return "subtracted";
			
			else if (a1 * b1 == c1)
				return "multiplied";
			
			else if (a1 % b1 == 0)
				return "divided";
			
			else
				return "none";
		}
		
		public static int ctoa(char word)
		{
			return (int)(word);
		}
		
		public static int addUpTo(int dig)
		{
			int a = 0;
			while (dig != 0)
			{
				a += dig;
				dig--;
			}
			return a;
		}
		
		public static int nextEdge(int side1, int side2)
		{
			int side3 = 0;
			while (side1 + side2 - 1 >  side3)
				side3++;
			return side3;
		}
		
		public static int sumOfCubes(int[] array)
		{
			int a=0;
		    for(int i=0; i<array.length; i++ ) 
		    	a += (int)Math.pow(array[i],3);
		    return a;
		}
		
		public static boolean abcmath(int a2, int b2, int c2)
		{
			for (int i=0; i<b2; i++)
				a2*=2;
			boolean b = a2 % c2 == 0 ? true : false;
			return b;
		}
}
