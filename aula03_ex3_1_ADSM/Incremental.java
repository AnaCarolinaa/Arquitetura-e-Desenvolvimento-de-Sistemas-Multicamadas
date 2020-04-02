package aula03_ex3_1_ADSM;

class Incremental 
{
	private static int count = 0;
	private int numero;
	
	private static Incremental incremental = null;
	
	private Incremental() 
	{
		numero = ++count;
	}
	
	public static synchronized Incremental getInstace()
	{
		if(incremental == null)
		{
			incremental = new Incremental();
		}
		return incremental;
	}
	
	public String toString() 
	{
		return "Incremental " + numero;
	}
}
