public class Car {
    Main.carType type;
    double fuel;

    public Car(Main.carType type, double fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    public void addFuel(double amount) {
        this.fuel += amount;
        System.out.printf("fuel charged about %fL. your car's fuel is about %5.2fL.\n", amount, this.fuel);
    }
    public void driveCar(Passenger passenger, int distance) {
        double passengerFactor = passenger.weight*0.01*distance;
        switch (this.type) {
            case CAR1 -> this.fuel -= passengerFactor/15;
            case CAR2 -> this.fuel -= passengerFactor/17;
            case CAR3 -> this.fuel -= passengerFactor/20;
        }
        System.out.printf("You give a ride to %s, your car's fuel is about %5.2fL.\n", passenger.name, this.fuel);
    }
}
