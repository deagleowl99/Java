package Labs;

public class Enemy extends Person
{
	String name;
    public Enemy(String name) 
    {
        super(name);
        this.name = name;
    }

    public static void checkRandom(int a1, Player p, Enemy e)
    {
    	if (e.a == a1)
    	{
    		e.loseLives(e);
    		System.out.println("�� �������, ������ � ����� � ������ " + e.name + " �������� " + e.lives + " ������");
    	}
    	else if (e.a > a1)
    		System.out.println("�� �� �������! �����, ��� �� ��������� ������� ������");
    	else if (e.a < a1)
    		System.out.println("�� �� �������! �����, ��� �� ��������� ������� ������");
    }
}
