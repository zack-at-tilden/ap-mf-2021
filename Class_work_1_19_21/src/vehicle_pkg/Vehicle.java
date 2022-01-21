package vehicle_pkg;

public class Vehicle {
	String fuel, movemethod, path;
	double weight, length, width, height, maxvelocity, mileage, acceleration, cargocapacity, fuelcapacity, horsepower, traction, handling, steeringangle, braking;
	int seats, windows, wheels;

	public Vehicle(double Weight,double Length,double Width,double Height,double MaxVelocity,double Acceleration,double Horsepower,double Mileage,String FuelType,double FuelCapacity,double Traction,double SteeringRatio,double SteeringAngle,double Braking,String Method,String TravelSurface) {
	fuel = FuelType;
	movemethod = Method;
	path = TravelSurface;
	weight = Weight;
	length = Length;
	width = Width;
	height = Height;
	maxvelocity = MaxVelocity;
	mileage = Mileage;
	acceleration = Acceleration;
	fuelcapacity = FuelCapacity;
	horsepower = Horsepower;
	traction = Traction;
	handling = SteeringRatio;
	steeringangle = SteeringAngle;
	braking = Braking;
	}
	
	public void go() {
		;
	}
}
