/**
 * Created by Nicole on 2/16/2017.
 */
public class CarClass {
    //Instance variables
    private String make;
    private String model;
    private String year;
    private double price;

    //Constructor--non-argument
    public CarClass() {
        make = "";
        model = "";
        year = ("");
        price = 0.0;
    }

        //All argument constructor
    public CarClass(String make, String model, String year, String price){
            this.make = make;
            this.model = model;
            this.year = year;
            this.price = 10999.90;
    }

    //The getter method -- Generated
    public String getMake() {
            return make;

    }public String getModel() {
            return model;

    }public String getYear() {
            return year;

    }public double getPrice() {
            return price;

    }

    //The setter method --Generated
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    }







