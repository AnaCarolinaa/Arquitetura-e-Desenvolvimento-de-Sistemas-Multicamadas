package aula03_ex3_2_ADSM;

public class SingletonExercise 
{
	public static void main(String args[]) 
	{
		Deck deck = Deck.getInstance();
		deck.print();
	}
}