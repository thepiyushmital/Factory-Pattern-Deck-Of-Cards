package com.pmital.practice.functors;

import java.util.HashSet;
import java.util.Set;

import com.pmital.practice.model.Card;
import com.pmital.practice.model.UnoCard;
import com.pmital.practice.utils.ColorEnum;
import com.pmital.practice.utils.FeatureEnum;

public class UnoDeckFunctor implements DeckFunctor{
	private Set<Card> cardSet;
	public UnoDeckFunctor(){
		this.cardSet = new HashSet<Card>();
	}
	
	@SuppressWarnings("unchecked")
	public <T> T createCardSet(){
		
			for(ColorEnum color: ColorEnum.values()){
				for(int i = 1; i <= 10; i++){
					this.cardSet.add(new UnoCard(i, color.name(), ""));	
				}
				for(FeatureEnum feature: FeatureEnum.values()) {
					this.cardSet.add(new UnoCard(-1, color.name(), feature.name()));	
				}
		}
		
			return (T) this.cardSet;
	}


}
