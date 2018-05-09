public class CompanyBO {
	
    public void displayCompanyDetails(Company[] company) {
                
        int count=0;
        for (int i=0; i<company.length; i++){
        	if (company[i].getCountry().equals("India"))
        		count++;
        }
        
        if (count == company.length){
        	System.out.println("All companies are inside India");
        }
        else{
        	System.out.println("Companies outside India :");
        	System.out.format("%-15s %-15s %-15s %-15s %s","Company ID","IATA Code","FMC Code","State","Country");
        	System.out.println();
        	for (int i=0; i<company.length; i++){
        		if (!company[i].getCountry().toUpperCase().equals("INDIA")){
        			System.out.print(company[i].toString());
        		}
        	}
        	
        }
        		  
	}
}