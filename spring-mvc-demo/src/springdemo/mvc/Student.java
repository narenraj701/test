package springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	private String firstName;
	@NotNull
	@Size(min = 1,message = "is required")
	private String lastName;
	private String country;
	private String favLang;
	@NotNull
	@Pattern(regexp = "^[0-9]{10}",message="only 10 digits")
	private String mobileNumber;
	@NotNull(message="is required")
	@Min(value=0,message="must be greater than 0")
	@Max(value=10,message="must be less than or equal to 10")
	private int freePasses;
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getFavLang() {
		return favLang;
	}
	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
