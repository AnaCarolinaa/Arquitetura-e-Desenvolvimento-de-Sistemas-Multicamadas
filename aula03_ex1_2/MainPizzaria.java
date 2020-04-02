package aula03_ex1_2_ADSM;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.JOptionPane;

public class MainPizzaria {

	public static void main(String[] args)
	{
		
		Locale brasil = new Locale("pt", "BR");
		Calendar calendar = Calendar.getInstance();
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia"));
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mes"));
		calendar.set(Calendar.MONTH, mes); 
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano"));
		calendar.set(Calendar.YEAR, ano);
 
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR));
        System.out.println("Dia da semana: "+calendar.get(Calendar.DAY_OF_WEEK));
        
        DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        System.out.println(f2.format(calendar.getTime()));
        
        //OBS: considere janeiro como sendo o mes 0, assim os meses vão de 0 a 11;
        
        if(calendar.get(Calendar.DAY_OF_WEEK) == 2 || calendar.get(Calendar.DAY_OF_WEEK) == 4 || calendar.get(Calendar.DAY_OF_WEEK) == 6)
        {
        	Pizzaiolo pizzaiolo = FactoryProducer.getPizzaPizzaiolo(2);
    		Pizza pizza = pizzaiolo.getPizzaiolo();
    		Pizza calzone = pizzaiolo.getPizzaiolo();
    		String mensagemPizza = pizza.pizza();
    		String mensagemCalzone = calzone.calzones();
    		System.out.println(mensagemPizza);
    		System.out.println(mensagemCalzone);
        }
        if(calendar.get(Calendar.DAY_OF_WEEK) == 3 || calendar.get(Calendar.DAY_OF_WEEK) == 5 || calendar.get(Calendar.DAY_OF_WEEK) == 7)
        {
        	Pizzaiolo pizzaiolo = FactoryProducer.getPizzaPizzaiolo(2);
    		Pizza pizza = pizzaiolo.getPizzaiolo();
    		Pizza calzone = pizzaiolo.getPizzaiolo();
    		String mensagemPizza = pizza.pizza();
    		String mensagemCalzone = calzone.calzones();
    		System.out.println(mensagemPizza);
    		System.out.println(mensagemCalzone);
        }
        else if(calendar.get(Calendar.DAY_OF_WEEK) == 1)
        {
        	System.out.println("Pizzaria fechada");
        }
	}
}
