package Cars;
//RANDOM PUBLIC CAR
import java.util.Scanner;

public class RandomCar extends Cars implements Normal{
    private String name;
    private String surname;
    private int ID;
    private int series;

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
        name = scan.nextLine();
        System.out.print("Surname : ");
        surname = scan.nextLine();
        System.out.print("ID Number : ");
        ID = scan.nextInt();
        series = getSeries();
    }

    public String printOwnerData(){
        return "Name : "+name+"\nSurname : "+surname+"\nID Number : "+ID+"\nCar Series Number : "+series;
    }
}
