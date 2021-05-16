package com.sbnz.sbnzBackend.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Sauce {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable =false)
	private String name;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Ingredient> ingredientList = new ArrayList<>();
	
	//private boolean deleted =false;
	
	
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

	@Override
	public String toString() {
		return "Sauce [id=" + id + ", name=" + name + ", ingredientList=" + ingredientList + "]";
	}
	
	

 /*	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
*/	
	
	
	
}
