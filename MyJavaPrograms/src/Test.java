
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sample Input and Output:");

		Scanner scan = new Scanner(System.in);
		
		int cnum = Integer.parseInt(scan.nextLine());
		Integer[] myarr = new Integer[cnum];
		int gnum = 0;
		
		for (int i=0; i<cnum; i++) {
			myarr[i] = Integer.parseInt(scan.nextLine());
			if (myarr[i] > gnum) {
				gnum = myarr[i];
			}
			
		}
		scan.close();
		System.out.println("Next customer id is " + (gnum+1));

	}

}
