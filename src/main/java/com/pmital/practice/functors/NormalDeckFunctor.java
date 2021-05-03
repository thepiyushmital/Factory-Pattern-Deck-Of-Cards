package com.pmital.practice.functors;

import java.util.HashSet;

import com.pmital.practice.model.Card;
import com.pmital.practice.model.NormalCard;
import com.pmital.practice.utils.HouseTypeEnum;

public class NormalDeckFunctor implements DeckFunctor{
	
	HashSet<Card> cardSet;
	public NormalDeckFunctor(){
		this.cardSet = (new HashSet<Card>());
	}
 
	public <T> T createCardSet(){
		for(int i = 1; i <= 13; i++){
			for(HouseTypeEnum house : HouseTypeEnum.values()){
				if(i > 10 )
					this.cardSet.add(new NormalCard( house.name(), (i), true));
				else
					this.cardSet.add(new NormalCard( house.name(), (i), false));
			}	
		}		
		return (T) this.cardSet;
	}

	
}
