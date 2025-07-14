package ToolBoothProblem;

public class AlleghenyTollBooth implements TollBooth{

	private int totalTrucks;
	private int totalReceipts;

	@Override
	public void calculateToll(Truck truck) {
		int tollDue = (truck.getAxles() * 5) + ((truck.getTotalWeight() / 500) * 10);
		System.out.println("Arrival of " + truck.getCompany() + " Truck");
		System.out.println("Truck arrival - Axles: " + truck.getAxles() +
				" Total weight: " + truck.getTotalWeight() +
				" Toll due: $" + tollDue);
		totalTrucks++;
		totalReceipts += tollDue;
	}
	
	@Override
	public void displayData() {
		System.out.println("Totals since last collection - Receipts: $" + totalReceipts +
				" Trucks: " + totalTrucks);
	}

	@Override
	public void reset() {
		System.out.println("*** Collecting receipts ***");
		System.out.println("Totals since the last collection - Receipts: $" + totalReceipts +
				" Trucks: " + totalTrucks);
		totalTrucks = 0;
		totalReceipts = 0;
		System.out.println("***** Reset Receipts **********");
		System.out.println("Totals since the last collection - Receipts: $0 Trucks: 0");
	}
}

