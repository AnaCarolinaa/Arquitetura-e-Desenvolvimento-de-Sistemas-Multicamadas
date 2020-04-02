package aula03_ex2_3_ADSM;

public class ConsoleDisplayLog extends DisplayLog
{
	@Override
	protected Log getParser() 
	{
		return new Console();
	}

}
