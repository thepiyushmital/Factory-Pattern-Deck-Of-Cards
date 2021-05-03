package com.pmital.practice.functorFactory;

import com.pmital.practice.functors.NormalDeckFunctor;
import com.pmital.practice.functors.UnoDeckFunctor;
import com.pmital.practice.utils.DeckTypeEnum;

public class DeckFunctorFactory extends AbstractDeckFunctorFactory{

	public  <T> T makeFunctor(DeckTypeEnum deckType){
	
		switch(deckType){
			case UNODECK: 
				return  (T) new UnoDeckFunctor();
			case NORMALDECK:
				return  (T) new NormalDeckFunctor();
			default:
				return null;
		}
	}

}
