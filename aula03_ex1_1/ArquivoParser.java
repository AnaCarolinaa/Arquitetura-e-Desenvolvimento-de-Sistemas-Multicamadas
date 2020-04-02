package aula03_ex1_1_ADSM;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArquivoParser implements Parser
{
	@Override
	public void parser() 
	{
		FileWriter arq;
		try 
		{
			arq = new FileWriter("output.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.print("Hello World");
			arq.close();
		} 
		catch (IOException error) 
		{
			System.out.println("Erro ao criar o arquivo log.txt"+error);
		}
	}

}
