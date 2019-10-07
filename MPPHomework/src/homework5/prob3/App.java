package homework5.prob3;

public class App {
	public static void main(String[] args)
	{
		VehicleFactory vf = new VehicleFactory();
		Vehicle v = vf.getVehicle("Car");
		v.startEngine();
		v = vf.getVehicle("Bus");
		v.startEngine();
		v = vf.getVehicle("ElectricCar");
		v.startEngine();
	}
}
