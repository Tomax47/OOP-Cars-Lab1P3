package Cars;

public class FireTruckLaddered extends Cars implements Emergency{

    public FireTruckLaddered(){}

    public FireTruckLaddered(Car car) {
        super(car);
    }

    @Override
    public String getCarType() {
        return "Emergency";
    }

    @Override
    public int carAge() {
        return 17;
    }

    @Override
    public double getMaxSpeed() {
        return 180;
    }

    @Override
    public boolean availableLadder() {
        return true;
    }
}
