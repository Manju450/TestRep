import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassObjects4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of companies :");

		int nCompanies = Integer.parseInt(br.readLine());

		Integer[] cId = new Integer[nCompanies];
		String[] iata = new String[nCompanies];
		String[] fmc = new String[nCompanies];
		String[] state = new String[nCompanies];
		String[] country = new String[nCompanies];

		//Address[] add = new Address[nCompanies];
		//Company[] com = new Company[nCompanies];

		for (int i = 0; i < nCompanies; i++) {

			System.out.println("Enter company " + (i + 1) + " d:");
			cId[i] = Integer.parseInt(br.readLine());
			System.out.println("Enter the company's IATA code :");
			iata[i] = br.readLine();
			System.out.println("Enter the company's FMC code :");
			fmc[i] = br.readLine();
			System.out.println("Enter the company's state :");
			state[i] = br.readLine();
			System.out.println("Enter the company's country :");
			country[i] = br.readLine();

		}


	}

}










/*
class CompanyBO {
	public void displayCompanyDetails(Company[] company) {

		String.format("%-15s %-15s %-15s %s", company.identifier, company.iata, company.fmc, company.address);

	}
}*/
