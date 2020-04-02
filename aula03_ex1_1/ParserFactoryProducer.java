package aula03_ex1_1_ADSM;

public class ParserFactoryProducer 
{
	public static AbstractParserFactory getFactory(String saida)
	{
		if(saida.equals("TELA"))
		{
			return new Tela();
		}
		else if(saida.equals("ARQUIVO"))
		{
			return new Arquivo();
		}
		return null;
	}
}
