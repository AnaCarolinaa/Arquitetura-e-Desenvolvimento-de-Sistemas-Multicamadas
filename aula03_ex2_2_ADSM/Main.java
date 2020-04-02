package aula03_ex2_2_ADSM;

import javax.swing.JOptionPane;

public class Main 
{
	static String senha = "desi gnpatt er ns";

	public static void main(String[] args) 
	{
		String dialogo = JOptionPane.showInputDialog(null, "Senha");
		
		if(dialogo.equals(senha))
		{
			DisplayProvedora displayProvedora = new ArquivoConfidencial_DisplayProvedora();
			displayProvedora.creator();
		}
		else
		{
			DisplayProvedora displayProvedora = new ArquivoPublico_DisplayProvedora();
			displayProvedora.creator();
		}
	}
}
