package com.sbnz.sbnzBackend.model;

import java.util.ArrayList;
import java.util.Collection;

public class Wine {
	
	private Long id;
	private String name;
	private int year;
	private WineColor color;
	private WineSugar wineSugar;
	private Collection<Sauce> sauceList =new ArrayList<>();
	private Collection<Meat> meatList =new ArrayList<>();
	private Collection<Ingredient> ingrdients=new ArrayList<>();
	private Recipe perfectRecipe;
	private boolean deleted= false;
	
	Wine(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public WineColor getColor() {
		return color;
	}

	public void setColor(WineColor color) {
		this.color = color;
	}

	public WineSugar getWineSugar() {
		return wineSugar;
	}

	public void setWineSugar(WineSugar wineSugar) {
		this.wineSugar = wineSugar;
	}

	public Collection<Sauce> getSauceList() {
		return sauceList;
	}

	public void setSauceList(Collection<Sauce> sauceList) {
		this.sauceList = sauceList;
	}

	public Collection<Meat> getMeatList() {
		return meatList;
	}

	public void setMeatList(Collection<Meat> meatList) {
		this.meatList = meatList;
	}

	public Collection<Ingredient> getIngrdiants() {
		return ingrdients;
	}

	public void setIngrdiants(ArrayList<Ingredient> ingrdiants) {
		this.ingrdients = ingrdiants;
	}
	
	public Collection<Ingredient> getIngrdients() {
		return ingrdients;
	}

	public void setIngrdients(Collection<Ingredient> ingrdients) {
		this.ingrdients = ingrdients;
	}

	public Recipe getPerfectRecipe() {
		return perfectRecipe;
	}

	public void setPerfectRecipe(Recipe perfectRecipe) {
		this.perfectRecipe = perfectRecipe;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	
	
	
	

}
