import java.util.Scanner;

class Shipment{
	
	private int id;
	private String shipperName;
	private String modeOfTransportation;
	private Float totalWeight;
	private String arrivalPort;
	private String departurePort;
	
	static int nextShipmentId = 1000;
	
	public Shipment (int id, String shipperName, String modeOfTransportation, Float totalWeight, String arrivalPort, String departurePort){
		
		this.id = id;
		this.shipperName = shipperName;
		this.modeOfTransportation = modeOfTransportation;
		this.totalWeight = totalWeight;
		this.arrivalPort= arrivalPort;
		this.departurePort = departurePort;
		
	}	
	
	public static Shipment createNewShipment (String shipperName, String modeOfTransportation, Float totalWeight, String arrivalPort, String departurePort) {
	
		Shipment ship3 = new Shipment(++nextShipmentId, shipperName, modeOfTransportation, totalWeight, arrivalPort, departurePort);
		return ship3;	
	}
	
	
	public String toString() {
		return	String.format("%-15d%-15s%-25s%-15s%-20s%s",this.id,this.shipperName,this.modeOfTransportation,this.totalWeight.toString()+"Kg",this.arrivalPort,this.departurePort);
	}
	
}

public class ClassObjects2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of shipments :");
		int nships = Integer.parseInt(scan.nextLine());
		
		String[] shipperName =  new String[nships];
		String[] modeTrans = new String[nships];
		String[] aPort = new String[nships];
		String[] dPort = new String[nships];
		//shipperName = modeTrans = aPort = dPort = null;
		Float[] tWeight = new Float[nships];
		
		Shipment[] ship = new Shipment[nships];
		
		for (int i=0; i<nships; i++) {
			
			System.out.println("Enter the shipment " + (i+1) + " deails");
			System.out.println("Enter the shipper name :");
			shipperName[i] = scan.nextLine();
			System.out.println("Enter the mode of transportation :");
			modeTrans[i] = scan.nextLine();
			System.out.println("EEnter the total weight :");
			tWeight[i] = Float.parseFloat(scan.nextLine());
			System.out.println("Enter the arrival port :");
			aPort[i] = scan.nextLine();
			System.out.println("Enter the departure port :");
			dPort[i] = scan.nextLine();
			
			ship[i] = Shipment.createNewShipment(shipperName[i], modeTrans[i], tWeight[i], aPort[i], dPort[i]);
			
			
		}
		scan.close();
		
		System.out.println("Shipment details are");
		System.out.format("%-15s%-15s%-25s%-15s%-20s%s","Id", "Shippername", "Mode of transportation", "Total Weight", "Arrival port", "Departure port");
		System.out.println();
		
		for (int i=0; i<nships; i++) 
			System.out.println(ship[i].toString());
		
		
	}
	
}