package Cars;

public abstract class Cars extends Car implements Comparable{

    protected Car car;

    public Cars(){}

    public Cars(Car car){
        this.car = car;
    }

    //Printing all the data of the car entered using the print method from the CAR class + printing the type of the car
    public void printData(){
        printData();
        System.out.println("Car's type :"+getCarType());
    }

    //Getting the type of the car, for each type of the cars
    public abstract String getCarType();
    public abstract int carAge();


    //Comparing two cars based on their age
    @Override
    public double compareTo(Cars car) {
        int carAge = carAge();
        int otherCarAge = car.carAge();
        return Double.compare(carAge, otherCarAge);
    }
}
