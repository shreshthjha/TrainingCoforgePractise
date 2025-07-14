package ToolBoothProblem;

public class TestTollBooth {

	public static void main(String[] args) {
		
		TollBooth booth = new AlleghenyTollBooth();

        Truck tm = new TataMotors(5, 12500);
        Truck al = new AshokLeylandTruck(2, 5000);

        booth.calculateToll(tm);
        booth.calculateToll(al);

        booth.displayData();     
        booth.reset();           

	}

}
