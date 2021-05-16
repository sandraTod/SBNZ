package com.sbnz.sbnzBackend.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Wine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private int year;
	
	@Enumerated(EnumType.STRING)
	private WineColor color;
	
	@Enumerated(EnumType.STRING)
	private WineSugar wineSugar;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Sauce> sauceList =new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Meat> meatList =new HashSet<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Ingredient> ingredients=new HashSet<>();
	
	//private Meal perfectMeal;
	//private boolean deleted= false;
	
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

	public Set<Meat> getMeatList() {
		return meatList;
	}

	public void setMeatList(Set<Meat> meatList) {
		this.meatList = meatList;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngrdients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	

	/*public Meal getPerfectMeal() {
		return perfectMeal;
	}

	public void setPerfectMeal(Meal perfectMeal) {
		this.perfectMeal = perfectMeal;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}*/
	
	
	
	
	

}
