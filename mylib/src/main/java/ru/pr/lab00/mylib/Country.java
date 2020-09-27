package ru.pr.lab00.mylib;

public class Country {
	private String name; //Страна имеет название
	private String capital; //И свою столицу

	public Country(String name, String capital) {
		setName(name);
		setCapital(capital);
	}

	public void setName(String name) { this.name = name; }
	public String getName() { return this.name; }

	public void setCapital(String capital) { this.capital = capital; }
	public String getCapital() { return this.capital; }

	@Override
	public String toString() {
		return name + " - " + capital;
	}
}