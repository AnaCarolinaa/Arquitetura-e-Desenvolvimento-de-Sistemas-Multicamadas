package aula03_ex2_3_ADSM;

public class Console implements Log
{
	int i;
	
	@Override
	public void display()
	{
		for(i=1; i <=10; i=i+1)
		{
			System.out.println(i);
		}
	}
}
