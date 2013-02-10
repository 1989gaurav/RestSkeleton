package sample.rest.service.model;

import org.codehaus.jackson.annotate.JsonProperty;


public class Contact {
	private String name;
	private String address;
	private String contactNumber;
	private String email;

	public Contact(String name, String address, String contactNumber,
			String email) {
		super();
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	@JsonProperty("contactNumber")
	public String getContactNumber() {
		return contactNumber;
	}

	@JsonProperty("contactNumber")
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}
}
