package com.pmital.practice.model;

public class UnoCard extends Card{
	private String color;
	private String feature;

	public UnoCard(int value, String color, String feature){	
		this.setValue(value);
		this.color = color;
		this.feature= feature;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return this.color;
	}

	public void setFeature(String feature){
		this.feature = feature;
	}

	public String getFeature(){
		return this.feature;
	}		

	@Override
	public boolean equals(Object b){
		UnoCard cardB = (UnoCard) b;
		if(cardB.getColor() == this.getColor() && cardB.getValue() == this.getValue() && cardB.getFeature() == this.getFeature()) 
			return true;
		return false;
	}
}