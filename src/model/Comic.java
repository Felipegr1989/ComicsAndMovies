package model;

public class Comic {
	
	private String name;
	private int editionNumber = 0;
	private int expeditionYear = 0;
	private String company;
	private String picture;

	public Comic(String name, int editionNumber, int expeditionYear, String company, String picture) {
		this.name = name;
		this.editionNumber = editionNumber;
		this.expeditionYear = expeditionYear;
		this.company = company;
		this.picture = picture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEditionNumber() {
		return editionNumber;
	}

	public void setEditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}

	public int getExpeditionYear() {
		return expeditionYear;
	}

	public void setExpeditionYear(int expeditionYear) {
		this.expeditionYear = expeditionYear;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	

}
