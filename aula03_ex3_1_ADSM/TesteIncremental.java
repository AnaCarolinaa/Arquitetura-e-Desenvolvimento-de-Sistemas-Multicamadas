package aula03_ex3_1_ADSM;

public class TesteIncremental 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i++) 
		{
			Incremental inc = Incremental.getInstace();
			System.out.println(inc);
		}
	}
}