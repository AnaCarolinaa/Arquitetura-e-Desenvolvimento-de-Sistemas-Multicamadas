package aula03_ex2_2_ADSM;

public class ArquivoConfidencial_DisplayProvedora extends DisplayProvedora
{
	@Override
	protected Provedora getParser() 
	{
		return new ArquivoConfidencial();
	}

}
