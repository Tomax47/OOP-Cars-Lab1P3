package Cars;

public abstract class Cars extends Car implements Comparable{

    protected Car car;

    public Cars(){}

    public Cars(Car car){
        this.car = car;
    }

    public Car getCar(){return car;}
    public Car setCar(Car car){return this.car=car;}


    //GETTING THE VALUES FROM THE INPUTTED CAR
    public double getWeight(){return car.getWeight();}
    public String getModel(){return car.getModel();}
    public String getColor(){return car.getColor();}
    public String getCondition(){return car.getCondition();}
    public int getSeries(){return car.getSeries();}
    public double getDistancePassed(){return car.getDistancePassed();}

    //Printing all the data of the car entered using the print method from the CAR class + printing the type of the car
    public String printData(){
        return "Model : "+getModel()+"\nColor : "+getColor()+"\nSeries : "+getSeries()+"\nWeight : "+getWeight()+"\nDistance Passed : "+getDistancePassed()+"\nCondition : "+getCondition()+"\nCar type: "+getCarType();
    }

    //Getting the type of the car, for each type of the cars
    public abstract String getCarType();
    public abstract int carAge();

    public double getMaxSpeed(){return getMaxSpeed();}
    public boolean availableLadder(){return availableLadder();}
    public void ownerData(){ownerData();}

    public String printOwnerData(){return printOwnerData();}

    public String printEmergencyData(){
        return "Max Speed : "+getMaxSpeed()+"\nLadder Availability : "+availableLadder();
    }


    //Comparing two cars based on their age
    @Override
    public double compareTo(Cars car) {
        int carAge = carAge();
        int otherCarAge = car.carAge();
        return Double.compare(carAge, otherCarAge);
    }

}
