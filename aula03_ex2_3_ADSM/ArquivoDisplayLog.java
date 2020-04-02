package aula03_ex2_3_ADSM;

public class ArquivoDisplayLog extends DisplayLog
{
	@Override
	protected Log getParser() 
	{
		return new Arquivo();
	}

}
