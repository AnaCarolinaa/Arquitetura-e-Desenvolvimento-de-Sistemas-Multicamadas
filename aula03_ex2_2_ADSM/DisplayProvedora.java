package aula03_ex2_2_ADSM;

public abstract class DisplayProvedora 
{
	public void creator()
	{
		Provedora provedora = getParser();
		provedora.display();
	}
	protected abstract Provedora getParser();
}
