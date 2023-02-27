package Cars;

public class Ambulance extends Cars implements Emergency{

    public Ambulance(){}

    public Ambulance(Car car) {
        super(car);
    }
    @Override
    public String getCarType() {
        return "Emergency";
    }

    @Override
    public int carAge() {
        return 3;
    }

    @Override
    public double getMaxSpeed() {
        return 200;
    }

    @Override
    public boolean availableLadder() {
        return false;
    }
}
