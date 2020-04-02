package aula03_ex2_3_ADSM;

import javax.swing.JOptionPane;

public class Main 
{
	public static void main(String[] args)
	{
		
		String opcao = JOptionPane.showInputDialog(null, "Digite o tipo de Log \narquivo ou console.");
		
		if(opcao.equals("arquivo"))
		{
			DisplayLog log = new ArquivoDisplayLog();
			log.creator();
		}
		else if(opcao.equals("console"))
		{
			DisplayLog log = new ConsoleDisplayLog();
			log.creator();
		}
	}
}
