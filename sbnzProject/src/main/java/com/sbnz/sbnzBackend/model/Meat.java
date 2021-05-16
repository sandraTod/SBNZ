package com.sbnz.sbnzBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Meat {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private MeatType meatType;
	
	//private boolean deleted;
	
	Meat(){}

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
	
	public MeatType getMeatType() {
		return meatType;
	}

	public void setMeatType(MeatType meatType) {
		this.meatType = meatType;
	}

	@Override
	public String toString() {
		return "Meat [id=" + id + ", name=" + name + ", meatType=" + meatType + "]";
	}

	
	
	
	

}
