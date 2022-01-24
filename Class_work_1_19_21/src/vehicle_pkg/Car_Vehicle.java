package vehicle_pkg;

public class Car_Vehicle extends Vehicle {
	double braking, traction;
	int wheels;
	
	public Car_Vehicle(double Weight,double Length,double Width,double Height,double MaxVelocity,double Acceleration,double Horsepower,double Mileage,String FuelType,double FuelCapacity,double SteeringRatio,double SteeringAngle,String Method,String TravelSurface,double CargoCapacity,int Seats,int Windows,double Traction,double Braking,int WheelCount) {
		super(Weight, Length, Width, Height, MaxVelocity, Acceleration, Horsepower, Mileage, FuelType, FuelCapacity, SteeringRatio, SteeringAngle, Method, TravelSurface, CargoCapacity, Seats, Windows);
		braking = Braking;
		traction = Traction;
		wheels = WheelCount;
		
	}
	
	public void display() {
		super.display();
		System.out.printf("%f, %f, %d\n",braking,traction,wheels);
	}

}
