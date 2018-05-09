import java.util.Scanner;

public class Array_3 {
	
	public static void main(String ags[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int anum = Integer.parseInt(scan.nextLine());
		
		String[] aircrafts = new String [anum];
		Double[] rates = new Double[anum];
		
		String str;
		Double temp=0.0;
		
		for (int i=0;i<anum;i++)
			aircrafts[i] = scan.nextLine();
			
		for (int i=0;i<anum;i++)
			rates[i] = Double.parseDouble(scan.nextLine());
		
		scan.close();
		
		for (int i=0; i<anum; i++) {
			for (int j=i+1; j<anum; j++) {
				
				if (rates[i] > rates[j]) {
					temp = rates[i];
					rates[i] = rates[j];
					rates[j] = temp;
					
					str = aircrafts[i];
					aircrafts[i] = aircrafts[j];
					aircrafts[j] = str;
				}
			}
		}
		
		System.out.println("Details are :");
		
		for (int i=0;i<anum;i++)
			System.out.println(aircrafts[i] + " - " + rates[i]);

		
	}

}
