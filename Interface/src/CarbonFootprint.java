
public interface CarbonFootprint {
	void getCarbonFootprint();

}

class Building implements CarbonFootprint
{
	public void getCarbonFootprint()
	{
		System.out.println("This message is from building CarbonFoot");
	}
}

class Bicycle implements CarbonFootprint
{
	public void getCarbonFootprint()
	{
		System.out.println("This message is from bicycle CarbonFoot");
	}
}

class Car implements CarbonFootprint
{
	public void getCarbonFootprint()
	{
		System.out.println("This message is from car CarbonFoot");
	}
}

class CarbonFootprintTest
{
	public static void main(String args[])
	{
		CarbonFootprint object1 = new Building();
		Car object2 = new Car();
		Bicycle object3 = new Bicycle();
		
		object1.getCarbonFootprint();
		object1 = object2;

		object1.getCarbonFootprint();
		object1 = object3;

		object1.getCarbonFootprint();
	}
}