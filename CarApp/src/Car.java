public class Car {
    private String carName;
    private double speed;
    private String units;


    public Car(String carName, double speed, String units) {
        this.carName = carName;
        this.speed = speed;
        this.units = units;



    }

    public String getCarName() {
        return carName;
    }

    public double getSpeed() {
        return speed;
    }

    public String getUnits() {
        return units;
    }

    public double convertUnitsToMiles(double x, String u){
        // get the units and convert to miles

        return x;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", speed=" + speed +
                '}';
    }
}
