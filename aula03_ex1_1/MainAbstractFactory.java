package aula03_ex1_1_ADSM;

import java.util.Random;

public class MainAbstractFactory 
{
	String tela = "TELA";
	String arquivo = "ARQUIVO";
	
	public static void main(String[] args) 
	{
		String[] vetorSaida = {"TELA", "ARQUIVO"}; //randomizar essas duas palavras
		Random random = new Random();
		int index = random.nextInt(vetorSaida.length); //seleciona o index do vetor vetorSaida (Posição da String)
				
		AbstractParserFactory abstractParserFactory = ParserFactoryProducer.getFactory(vetorSaida[index]);
		Parser parser = abstractParserFactory.getParserType();
		parser.parser();
	}

}
