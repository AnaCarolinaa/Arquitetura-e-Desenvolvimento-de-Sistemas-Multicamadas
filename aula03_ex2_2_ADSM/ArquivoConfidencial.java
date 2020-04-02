package aula03_ex2_2_ADSM;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArquivoConfidencial implements Provedora
{
	@Override
	public void display() 
	{
		FileWriter arq;
		try 
		{
			arq = new FileWriter("confidencial.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.print("Estas informa��es s�o confidenciais, o que significa que provavelmente s� voc� sabe a senha.");
			arq.close();
		} 
		catch (IOException error) 
		{
			System.out.println("Erro ao criar o arquivo log.txt"+error);
		}
		
		try 
		{
		      FileReader arq1 = new FileReader("confidencial.txt");
		      BufferedReader lerArq = new BufferedReader(arq1);
		 
		      String linha = lerArq.readLine(); 
		
		      while (linha != null) 
		      {
		        System.out.printf("%s\n", linha);
		        linha = lerArq.readLine(); 
		      }
		 
		      arq1.close();
	    } 
		catch (IOException e) 
		{
	        System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	    }
	}
	
}
