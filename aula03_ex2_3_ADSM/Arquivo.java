package aula03_ex2_3_ADSM;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo implements Log 
{
	int i;

	@Override
	public void display() 
	{
		FileWriter arq;
		try 
		{
			arq = new FileWriter("log.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			for(i=1; i <= 10; i=i+1)
			{
				gravarArq.print(i);
				gravarArq.print("\n");
			}
			arq.close();
		} 
		catch (IOException error) 
		{
			System.out.println("Erro ao criar o arquivo log.txt"+error);
		}
	    
	}
}
