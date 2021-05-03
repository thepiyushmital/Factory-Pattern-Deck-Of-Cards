package com.pmital.practice.functorFactory;

import com.pmital.practice.functors.DeckFunctor;
import com.pmital.practice.utils.DeckTypeEnum;

public abstract class AbstractDeckFunctorFactory {

	public abstract <T> T  makeFunctor(DeckTypeEnum deckType);
}