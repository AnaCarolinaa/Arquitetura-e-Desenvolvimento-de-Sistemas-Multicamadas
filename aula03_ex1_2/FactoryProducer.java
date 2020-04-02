package aula03_ex1_2_ADSM;

public class FactoryProducer 
{
	public FactoryProducer() throws Exception
	{
		throw new Exception();
	}
	public static Pizzaiolo getPizzaPizzaiolo(int numeroPizzaiolo)
	{
		if(numeroPizzaiolo == 1)
		{
			return new Pizzaiolo1();
		}
		else if(numeroPizzaiolo == 2)
		{
			return new Pizzaiolo2();
		}
		return null;
	} 
	
}
