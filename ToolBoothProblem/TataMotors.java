package ToolBoothProblem;

public class TataMotors implements Truck {
	
	private final int axles;
    private final int totalWeight;
    
    
    
	public TataMotors(int axles, int totalWeight) {
		super();
		this.axles = axles;
		this.totalWeight = totalWeight;
	}
	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return axles;
	}
	@Override
	public int getTotalWeight() {
		// TODO Auto-generated method stub
		return totalWeight;
	}
	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return "Tata Motors";
	}
    
    

}
