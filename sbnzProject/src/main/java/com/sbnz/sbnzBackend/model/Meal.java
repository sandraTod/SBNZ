package com.sbnz.sbnzBackend.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;


public class Meal {
	
	private Long id;
	private String name;
	private Sauce sauce;
	private Meat meat;
	private Collection <Ingredient> ingredients = new ArrayList<>();
	
	Meal(){}

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

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Meat getMeat() {
		return meat;
	}

	public void setMeat(Meat meat) {
		this.meat = meat;
	}

	public Collection<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Collection<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Meal [id=" + id + ", name=" + name + ", sauce=" + sauce + ", meat=" + meat + ", ingredients="
				+ ingredients + "]";
	}
	
	
	
	
	

}
