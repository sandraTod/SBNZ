package com.sbnz.sbnzBackend.model;

public class Meat {
	
	private Long id;
	private String name;
	private MeatType meatType;
	private boolean deleted;
	
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

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	
	

}
