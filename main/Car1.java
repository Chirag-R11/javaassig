package main;
class CarDetails
{
	private String name;
	private int  milage;
	private int cost;
	
	public void setData (String x, int y, int z)// setter method
	{
		name =x;
		milage =y;
		cost =z;
	}
	public String getName()
	{
		return name;
	}
	public int getMilage()
	{
		return milage;
	}
	public int getCost()
	{
		return cost;
	}
}
public class Car1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarDetails c = new CarDetails();
		c.setData("BMW", 10, 7000000);
		System.out.println(c.getName());
		System.out.println(c.getMilage());
		System.out.println(c.getCost());
	}

}