package com.sbnz.sbnzBackend.model;

import java.util.ArrayList;
import java.util.Collection;

public class Sauce {

	private Long id;
	private String name;
	private Collection<Ingredient> ingredientList = new ArrayList<>();
	private boolean deleted =false;
	
	public Sauce() {
	}

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

	public Collection<Ingredient> getIngredientList() {
		return ingredientList;
	}

	public void setIngredientList(Collection<Ingredient> ingredientList) {
		this.ingredientList = ingredientList;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
