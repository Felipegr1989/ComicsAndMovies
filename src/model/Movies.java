package model;

public class Movies {
	
	private String name;
	private int year = 0;
	private String company;
	private String director;
	private String country;
	private String picture;

	public Movies(String name, int year, String company, String director, String country, String picture) {
		
		this.name = name;
		this.year = year;
		this.company = company;
		this.director = director;
		this.country = country;
		this.picture = picture;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	

}
