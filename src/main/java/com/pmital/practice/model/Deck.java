package com.pmital.practice.model;

import java.util.Set;

import com.pmital.practice.utils.DeckTypeEnum;

public class Deck {

		private DeckTypeEnum deckType;
		
		private Set<Card> cardSet;

		public DeckTypeEnum getDeckType() {
			return deckType;
		}

		public void setDeckType(DeckTypeEnum deckType) {
			this.deckType = deckType;
		}

		public Set<Card> getCardSet() {
			return cardSet;
		}

		public void setCardSet(Set<Card> cardSet) {
			this.cardSet = cardSet;
		}
		
}
