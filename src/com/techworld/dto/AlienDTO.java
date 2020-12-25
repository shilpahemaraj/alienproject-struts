package com.techworld.dto;

public class AlienDTO {
	private String alienId;
	private String alienName;
	private String alienPlanet;
	private String age;

	public String getAlienId() {
		return alienId;
	}

	public void setAlienId(String alienId) {
		this.alienId = alienId;
	}

	public String getAlienName() {
		return alienName;
	}

	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}

	public String getAlienPlanet() {
		return alienPlanet;
	}

	public void setAlienPlanet(String alienPlanet) {
		this.alienPlanet = alienPlanet;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "AlienDTO [alienId=" + alienId + ", alienName=" + alienName + ", alienPlanet=" + alienPlanet + ", age="
				+ age + "]";
	}

}
