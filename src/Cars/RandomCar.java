package Cars;
//RANDOM PUBLIC CAR
import java.util.Scanner;

public class RandomCar extends Cars implements Normal{

    public RandomCar(Car car){
        super(car);
    }

    //Getting the car type from the abstract method in the class abstract CARS
    @Override
    public String getCarType() {
        return "Public";
    }

    @Override
    public int carAge() {
        return 5;
    }

    //The data collection method of the owner of the public car from the Interface NORMAL
    @Override
    public void ownerData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name : ");
        String name = scan.nextLine();
        System.out.print("Surname : ");
        String surname = scan.nextLine();
        System.out.print("ID Number : ");
        int ID = scan.nextInt();
    }
}
