package Cars;

import java.util.Scanner;

public class Car {

    private String model;
    private String color;
    private String condition;
    private int series;
    private double weight;
    private double distancePassed;


    //Default values of the car data
    public Car(){
        this.model = null;
        this.color = null;
        this.condition = null;
        this.series = 0;
        this.weight = 0.0;
        this.distancePassed = 0.0;
    }

    //Car's data entry values
    public Car(String model,String color, String condition, int series, double weight, double distancePassed) {
        this.model = model;
        this.color = color;
        this.condition = condition;
        this.series = series;
        this.weight = weight;
        this.distancePassed = distancePassed;
    }


    //Reading the data entered of a specific car
    public void carData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Model : ");
        model = scan.nextLine();
        System.out.print("Color : ");
        color = scan.nextLine();
        System.out.print("Series : ");
        series = scan.nextInt();
        System.out.print("Weight : ");
        weight = scan.nextDouble();
        System.out.print("Distance passed : ");
        distancePassed = scan.nextDouble();
        System.out.print("Condition : ");
        condition = scan.nextLine();
    }

    //Getting the values stored
    public String getModel(){return model;}
    public String getColor(){return color;}
    public String getCondition(){return condition;}
    public int getSeries(){return series;}
    public double getWeight(){return weight;}
    public double getDistancePassed(){return distancePassed;}


    //Making changes to the entered values
    public String setModel(String model){return this.model=model;}
    public String setColor(String color){return this.color=color;}
    public String setCondition(String condition){return this.condition=condition;}
    public int setSeries(int series){return this.series=series;}
    public double setWeight(double weight){return this.weight=weight;}
    public double setDistancePassed(double distancePassed){return this.distancePassed=distancePassed;}

    //Printing car's data
    public String print(){
        return "Model : "+model+"\nColor : "+color+"\nSeries : "+series+"\nWeight : "+weight+"\nDistance Passed : "+distancePassed+"\nCondition : "+condition;
    }
}
