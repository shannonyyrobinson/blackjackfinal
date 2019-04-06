package blackjackfiles;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;
        private int size;

	public Deck ()
	{
                for (String s: SUITS){
                    for (int c = 1; c < 14; c++){
                        stackOfCards.add( new BlackJackCard(c, s));
                    }
                }
                topCardIndex = 51;
		
	}

	//modifiers
   public void shuffle ()
	{
		Collections.shuffle(stackOfCards);
                top = 51;
	}

   //accessors
	public int  size ()
	{
		return size;
	}

	public int numCardsLeft()
	{
		return size;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}