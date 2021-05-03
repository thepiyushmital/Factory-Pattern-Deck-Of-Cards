package com.pmital.practice.model;

public class NormalCard extends Card{
	private String house; 
	private boolean hasImage;

	public NormalCard(String house, int value, boolean hasImage){
		this.house= house;
		this.setValue(value);
		this.hasImage = hasImage;
	}
	public NormalCard(){
	}	

	public void setHouse(String house){
		this.house = house;
	}
	
	public void setImage(boolean hasImage){
		this.hasImage = hasImage;
	}

  	public String getHouse(){
		return this.house;
	}

	
	public boolean getImage(){
		return this.hasImage;
	}

	@Override
	public boolean equals(Object b){
		NormalCard cardB = (NormalCard) b;
		if(cardB.getHouse() == this.getHouse() && 
		cardB.getValue() == this.getValue())
			return true;
		return false;
	}

}