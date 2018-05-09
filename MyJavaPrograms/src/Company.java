public class Company {
    private String identifier;
    private String iata;
	private String fmc;
	private Address address;
	// Setters
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public void setFmc(String fmc) {
		this.fmc = fmc;
	}
	public void setAddress(Address add){
		this.address = add;
	}
	public void setState(String state){
		this.address.setState(state);
	}
	public void setCountry(String country){
		this.address.setCountry(country);
	}
	// Getters
	public String getIdentifier() {
		return this.identifier;
	}
	public String getIata() {
		return this.iata;
	}
	public String setFmc() {
		return this.fmc;
	}
	public Address getAddress(){
		return this.address;
	}
	public String getCountry(){
		return this.address.getCountry();
	}
	
/*	public Company(String identifier, String iata, String fmc, Address address) {
		this.identifier = identifier;
		this.iata = iata;
		this.fmc = fmc;
		this.address = address;
	}*/
	
	public Company(){
		this.identifier = null;
		this.iata = null;
		this.fmc = null;
	}
	
	public String toString() {
		return String.format("%-15s %-15s %-15s %s", this.identifier, this.iata, this.fmc, this.address);
	}
}
