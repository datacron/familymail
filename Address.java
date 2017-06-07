package com.wonderfulbytes.tests.stacksAndQueues.familymail;

public class Address {
	
	private String street;
	private int streetN;
	private String town;
	private String district;
	private int postCode;

	public Address() {
	}
	
	public Address(String street, int streetN,
			String town, String district,
			int postCode) {
		this.street = street.toUpperCase();
		this.streetN = streetN;
		this.town = town.toUpperCase();
		this.district = district.toUpperCase();
		this.postCode = postCode;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the streetN
	 */
	public int getStreetN() {
		return streetN;
	}

	/**
	 * @param streetN the streetN to set
	 */
	public void setStreetN(int streetN) {
		this.streetN = streetN;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the postCode
	 */
	public int getPostCode() {
		return postCode;
	}

	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

}
