import java.util.Scanner;
import Tasks.Tasks1;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("������� �� �������");
		System.out.println("������� ������ �����:");
		int a = in.nextInt();
		System.out.println("������� ������ �����:");
		int b = in.nextInt();
		System.out.println("���������: " + Tasks1.remainder(a,b));
		
		System.out.println("������� ������������");
		System.out.println("������� ������ �����:");
		double a1 = in.nextDouble();
		System.out.println("������� ������ �����:");
		double b1 = in.nextDouble();
		System.out.println("���������: " + Tasks1.triArea(a1,b1));
		
		System.out.println("���� ��������");
		System.out.println("������� ������ �����:");
		int a2 = in.nextInt();
		System.out.println("������� ������ �����:");
		int b2 = in.nextInt();
		System.out.println("������� ������ �����:");
		int �2 = in.nextInt();
		System.out.println("���������: " + Tasks1.animals(a2,b2,�2));
		
		System.out.println("�������");
		System.out.println("������� ������ �����:");
		double a3 = in.nextDouble();
		System.out.println("������� ������ �����:");
		int b3 = in.nextInt();
		System.out.println("������� ������ �����:");
		int �3 = in.nextInt();
		System.out.println("���������: " + Tasks1.profitableGamble(a3,b3,�3));
		
		System.out.println("��������");
		System.out.println("������� ������ �����:");
		int a4 = in.nextInt();
		System.out.println("������� ������ �����:");
		int b4 = in.nextInt();
		System.out.println("������� ������ �����:");
		int �4 = in.nextInt();
		System.out.println("���������: " + Tasks1.operation(a4,b4,�4));
		
		System.out.println("ASCII");
		System.out.println("������� ������:");
		char a5 = in.next().charAt(0);
		System.out.println("���������: " + Tasks1.ctoa(a5));
		
		System.out.println("����� �����");
		System.out.println("������� �����:");
		int a6 = in.nextInt();
		System.out.println("���������: " + Tasks1.addUpTo(a6));
		
		System.out.println("����������� ������������");
		System.out.println("������� ������ �����:");
		int a7 = in.nextInt();
		System.out.println("������� ������ �����:");
		int b7 = in.nextInt();
		System.out.println("���������: " + Tasks1.nextEdge(a7,b7));
		
		System.out.println("������");
	    int[] array = {};
		System.out.println("���������: " + Tasks1.sumOfCubes(array));
		
		System.out.println("ABCMATH");
		System.out.println("������� ������ �����:");
		int a8 = in.nextInt();
		System.out.println("������� ������ �����:");
		int b8 = in.nextInt();
		System.out.println("������� ������ �����:");
		int c8 = in.nextInt();
		System.out.println("���������: " + Tasks1.abcmath(a8,b8,c8));
		
	}

}
