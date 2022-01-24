package vehicle_pkg;

public class Vehicle {
	String fuel, movemethod, path;
	double weight, length, width, height, maxvelocity, mileage, acceleration, cargocapacity, fuelcapacity, horsepower, handling, steeringangle;
	int seats, windows;

	public Vehicle(double Weight,double Length,double Width,double Height,double MaxVelocity,double Acceleration,double Horsepower,double Mileage,String FuelType,double FuelCapacity,double SteeringRatio,double SteeringAngle,String Method,String TravelSurface,double CargoCapacity,int Seats,int Windows) {
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
	handling = SteeringRatio;
	steeringangle = SteeringAngle;
	cargocapacity = CargoCapacity;
	seats = Seats;
	windows = Windows;
	}
	
	public void go() {
		;
	}
	
	public void display() {
		System.out.println(weight);
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
		System.out.println(maxvelocity);
		System.out.println(mileage);
		System.out.println(acceleration);
		System.out.println(fuelcapacity);
		System.out.println(horsepower);
		System.out.println(handling);
		System.out.println(steeringangle);
		System.out.println(cargocapacity);
		System.out.println(fuel);
		System.out.println(movemethod);
		System.out.println(path);
		System.out.println(seats);
		System.out.println(windows);
	}
}
