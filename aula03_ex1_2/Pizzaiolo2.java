package aula03_ex1_2_ADSM;

public class Pizzaiolo2 implements Pizzaiolo
{
	@Override
	public Pizza getPizzaiolo() 
	{
		return new Pizza2();
	}

}
