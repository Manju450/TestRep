public class Address {
    private String state;
    private String country;
	// setters
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	// getters
	public String getState() {
		return this.state;
	}
	public String getCountry() {
		return this.country;
	}
    
	public Address(String state, String country) {
		this.state = state;
		this.country = country;
	}
	
	public Address(){
		this.state = null;
		this.country = null;
	}
	
	public String toString() {
		return String.format("%-15s %s\n", this.state, this.country);
	}
}