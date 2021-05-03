package com.pmital.practice.deck;

import java.util.HashSet;

import com.pmital.practice.functorFactory.DeckFunctorFactory;
import com.pmital.practice.functors.DeckFunctor;
import com.pmital.practice.model.Card;
import com.pmital.practice.model.Deck;
import com.pmital.practice.model.NormalCard;
import com.pmital.practice.model.UnoCard;
import com.pmital.practice.utils.DeckTypeEnum;

/**
 *
 *App for creating Deck 
 *Uses Factory Design Pattern for Type of Deck Selection
 *Uses Abstract factory pattern for abstractor of functor methods
 *Uses Command Design Pattern for seperating business logic from application code.
 */
public class App 
{

	public static void main(String args[]){
		// Create an instance of the deck functor factory
		DeckFunctorFactory deckFunctorFactory =  new DeckFunctorFactory();
		
		// make Functor function creates the required functor using the parameter passed. 
		// Abstraction of functor to be selected supports open/close principle (SOLID)
		DeckFunctor deckFunctor = deckFunctorFactory.makeFunctor(DeckTypeEnum.valueOf(args[0]));
		
		Deck deck = new  Deck();
		deck.setDeckType(DeckTypeEnum.valueOf(args[0]));
		HashSet<Card> cardSet = deckFunctor.createCardSet();
		deck.setCardSet(cardSet);
		
		printDeckDetails(deck);
		
	}

	private static void printDeckDetails(Deck deck) {
		// TODO Auto-generated method stub
		System.out.println(" Deck type: " + deck.getDeckType());
		switch(deck.getDeckType()) {
			case UNODECK:
					for(Card card : deck.getCardSet()) {
						System.out.println(" value:  " + ((UnoCard) card).getValue() + ","
								+ " feature: " + ((UnoCard) card).getFeature() + ","
								+ " color: " + (((UnoCard) card).getColor()));
					}
					break;
			case NORMALDECK:
				for(Card card : deck.getCardSet()) {
					System.out.println(" value:  " + ((NormalCard) card).getValue() + ","
							+ " house: " + ((NormalCard) card).getHouse() + ","
							+ " faceCard: " + (((NormalCard) card).getImage()));
				}
		}
		
	}	
    
}
