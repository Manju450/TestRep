import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sample Input and Output:");

		Scanner scan = new Scanner(System.in);
		
		int cnum = Integer.parseInt(scan.nextLine());
		Integer[] myarr = new Integer[cnum];
		int temp=0;
		
		for (int i=0; i<cnum; i++)
			myarr[i] = Integer.parseInt(scan.nextLine());
		
		for (int i=0;i<cnum;i++) {
			for (int j=i+1; j<cnum; j++) {
				if (myarr[i] > myarr[j]) {
					temp = myarr[i];
					myarr[i] = myarr[j];
					myarr[j] = temp;
				}
			}
		}
		
		for (int j=0; j<cnum-1; j++) {
			if( (myarr[j+1]-myarr[j]) > 1 ) {
				temp = myarr[j]+1;
				break;
			}
				
		}
		
		System.out.println(temp);	
		scan.close();
		
	}

}
