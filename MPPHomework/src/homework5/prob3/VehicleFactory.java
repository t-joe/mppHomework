package homework5.prob3;

public class VehicleFactory {
	public Vehicle getVehicle(String type)
	{
		switch(type.toLowerCase())
		{
		case "car":
			return new Car();
		case "bus":
			return new Bus();
		case "truck":
			return new Truck();
		case "electriccar":
			return new ElectricCar();
			default:
				return null;
		}
	}
}
