package blackjackfiles;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{
  	//constructors

        public BlackJackCard(){
            super(suit, face);
        }

  	public int getValue()
  	{
  		if( getFace() == 1 )
			return 11;
		if( getFace() >= 10 )
			return 10;
		return getFace();
  	}
  	
 }