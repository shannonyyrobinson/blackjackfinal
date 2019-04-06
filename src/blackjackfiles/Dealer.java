package blackjackfiles;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//define Dealer class here
public class Dealer{
	
	
	
	
	//instance variable - Deck 
        public static int NUMCARDS = 52;
        public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
        private List<Card> cards = new ArrayList<Card>();
	private int top;




	//constructors
        public Dealer(){
            for (String s: SUITS){
                    for (int c = 1; c < 14; c++){
                        cards.add( new BlackJackCard(s, c));
                    }
                }
                top = 51;
        }





	//method to shuffle
        public void shuffle(){
            Collections.shuffle(cards);
            top = 51;
        }  





	//method to deal a card
        public Card dealCard(){
            Card t = cards.get(top);
            top--;
            return t;
        }




	//hit method goes here
}