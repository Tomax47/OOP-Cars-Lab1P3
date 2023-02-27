package Cars;

public class FireTruck extends Cars implements Emergency{

    public FireTruck(){}

    public FireTruck(Car car) {
        super(car);
    }
    @Override
    public String getCarType() {
        return "Emergency";
    }

    @Override
    public int carAge() {
        return 10;
    }

    @Override
    public double getMaxSpeed() {
        return 160;
    }

    @Override
    public boolean availableLadder() {
        return false;
    }
}
