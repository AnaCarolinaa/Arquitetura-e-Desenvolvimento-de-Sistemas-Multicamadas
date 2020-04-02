package aula03_ex2_3_ADSM;

public abstract class DisplayLog 
{
	public void creator()
	{
		Log log = getParser();
		log.display();
	}
	
	protected abstract Log getParser();
}
