import java.util.Scanner;
import Tasks.Tasks1;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("ќ—“ј“ќ  ќ“ ƒ≈Ћ≈Ќ»я");
		System.out.println("¬ведите первое число:");
		int a = in.nextInt();
		System.out.println("¬ведите второе число:");
		int b = in.nextInt();
		System.out.println("–езультат: " + Tasks1.remainder(a,b));
		
		System.out.println("ѕЋќўјƒ№ “–≈”√ќЋ№Ќ» ј");
		System.out.println("¬ведите первое число:");
		double a1 = in.nextDouble();
		System.out.println("¬ведите второе число:");
		double b1 = in.nextDouble();
		System.out.println("–езультат: " + Tasks1.triArea(a1,b1));
		
		System.out.println("Ћјѕџ ∆»¬ќ“Ќџ’");
		System.out.println("¬ведите первое число:");
		int a2 = in.nextInt();
		System.out.println("¬ведите второе число:");
		int b2 = in.nextInt();
		System.out.println("¬ведите третье число:");
		int с2 = in.nextInt();
		System.out.println("–езультат: " + Tasks1.animals(a2,b2,с2));
		
		System.out.println("ѕ–ќ‘»“џ");
		System.out.println("¬ведите первое число:");
		double a3 = in.nextDouble();
		System.out.println("¬ведите второе число:");
		int b3 = in.nextInt();
		System.out.println("¬ведите третье число:");
		int с3 = in.nextInt();
		System.out.println("–езультат: " + Tasks1.profitableGamble(a3,b3,с3));
		
		System.out.println("ќѕ≈–ј÷»я");
		System.out.println("¬ведите первое число:");
		int a4 = in.nextInt();
		System.out.println("¬ведите второе число:");
		int b4 = in.nextInt();
		System.out.println("¬ведите третье число:");
		int с4 = in.nextInt();
		System.out.println("–езультат: " + Tasks1.operation(a4,b4,с4));
		
		System.out.println("ASCII");
		System.out.println("¬ведите символ:");
		char a5 = in.next().charAt(0);
		System.out.println("–езультат: " + Tasks1.ctoa(a5));
		
		System.out.println("—умма чисел");
		System.out.println("¬ведите число:");
		int a6 = in.nextInt();
		System.out.println("–езультат: " + Tasks1.addUpTo(a6));
		
		System.out.println("Ќ≈–ј¬≈Ќ—“¬ќ “–≈”√ќЋ№Ќ» ј");
		System.out.println("¬ведите первое число:");
		int a7 = in.nextInt();
		System.out.println("¬ведите второе число:");
		int b7 = in.nextInt();
		System.out.println("–езультат: " + Tasks1.nextEdge(a7,b7));
		
		System.out.println("ћј——»¬");
	    int[] array = {};
		System.out.println("–езультат: " + Tasks1.sumOfCubes(array));
		
		System.out.println("ABCMATH");
		System.out.println("¬ведите первое число:");
		int a8 = in.nextInt();
		System.out.println("¬ведите второе число:");
		int b8 = in.nextInt();
		System.out.println("¬ведите третье число:");
		int c8 = in.nextInt();
		System.out.println("–езультат: " + Tasks1.abcmath(a8,b8,c8));
		
	}

}
