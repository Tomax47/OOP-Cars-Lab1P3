package Cars;

import javax.management.ValueExp;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //SOMETHING IS WRONG WITH THE PRINT METHOD IN CLASS CAR

        //Entering the cars data in an array
        Cars[] car = {
                new RandomCar(new Car("KiaRio", "White", "Good",2212,6000,100000)),
                new RandomCar(new Car("Bugatti", "Carbon Black", "Perfect",5005,3500,50000)),
                new Ambulance(new Car("Kia", "White", "Good",5105,3000,66000)),
                new FireTruck(new Car("Kia", "Red", "Good",5205,5500,60000)),
                new FireTruckLaddered(new Car("Kia", "Red", "Good",5305,3500,50070)),
                new RandomCar(new Car("Nissan", "Gray", "Bad",1000,4000,200000))
        };

        //Printing out the data of the heaviest car in the list
        int heaviestCar = heaviestCar(car);
        System.out.println(car[heaviestCar].printData());

    }


    //Method for comparing cars' weight & getting out the heaviest among them
    public static int heaviestCar(Cars[] car){
        double heaviestCar= 0.0;
        int index=0;
        for (int i = 0; i < car.length; i++) {
            if(car[i].getWeight() > heaviestCar) {
                heaviestCar = car[i].getWeight();
                index = i;
            }
        }
        return index;
    }
}
