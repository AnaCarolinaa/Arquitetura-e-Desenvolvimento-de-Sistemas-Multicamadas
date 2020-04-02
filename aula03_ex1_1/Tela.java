package aula03_ex1_1_ADSM;

public class Tela implements AbstractParserFactory
{
	@Override
	public Parser getParserType() 
	{
			return new TelaParser();
	}
	
}
