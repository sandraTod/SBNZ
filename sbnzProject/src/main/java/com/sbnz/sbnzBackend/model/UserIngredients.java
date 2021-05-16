package com.sbnz.sbnzBackend.model;

import java.util.ArrayList;
import java.util.Collection;

public class UserIngredients {
	
	private String sauceName;
	private MeatType meatType;
	private Collection<Ingredient> ingredientsList =new ArrayList<>(); 
	
	
	public UserIngredients(){}


	public String getSauce() {
		return sauceName;
	}


	public void setSauce(String sauce) {
		this.sauceName = sauce;
	}


	public MeatType getMeatType() {
		return meatType;
	}


	public void setMeatType(MeatType meatType) {
		this.meatType = meatType;
	}


	public Collection<Ingredient> getIngredientList() {
		return ingredientsList;
	}


	public void setIngrediantsMeal(Collection<Ingredient> ingredientsList) {
		this.ingredientsList= ingredientsList;
	}


	@Override
	public String toString() {
		return "UserIngredients [sauceName=" + sauceName + ", meatType=" + meatType + ", ingrediantsMeal=" + ingredientsList
				+ "]";
	}
	
	
	
	

}
