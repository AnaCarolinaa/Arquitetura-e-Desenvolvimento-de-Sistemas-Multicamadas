package aula03_ex1_1_ADSM;

public class Arquivo implements AbstractParserFactory
{
	@Override
	public Parser getParserType() 
	{
			return new ArquivoParser();
	}
	
}
