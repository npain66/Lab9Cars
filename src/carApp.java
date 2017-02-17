import java.util.Scanner;

/**
 * Created by Nicole on 2/16/2017.
 */
public class carApp {

    //write a main to substantiate and test the User class
    public static void main (String [] args) {

        System.out.println("Welcome to Grand Circus Motors!");

    //this calls the no-argument constructor
        CarClass car1 = new CarClass();

        //this calls the constructor that takes 4 String arguments
        CarClass car2 = new CarClass("Ford", "Explorer", "2017", "10999.99");

        //using setter to change an instance
        //car2.setMake ("Ford");
        //car2.setModel ("Explorer");
        //car2.setYear ("2017");
        //car2.setPrice ("1099.99");

        //using getters to output customer info
        System.out.println(car1.getMake() + ":" + car2.getMake());
        System.out.println(car1.getModel() + ":" + car2.getModel());
        System.out.println(car1.getYear() + ":" + car2.getYear());
        System.out.println(car1.getPrice() + ":" + car2.getPrice());

        //get ouput
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cars are you entering? " + car1.getMake() + ":" );















    }
}
