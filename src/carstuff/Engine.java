package carstuff;


public class Engine {
    private FuelType fuelType;
    private int noOfCylinders;
    private int capacity;
    private int horsePower;
    private float mpg;

    public Engine (FuelType fuelType, int noOfCylinders, int capacity, int horsePower, float mpg){
        this.fuelType = fuelType;
        this.noOfCylinders = noOfCylinders;
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.mpg = mpg;
    }

    public float getMpg (){
        return mpg;
    }

    public int getNoOfCylinders(){
        return noOfCylinders;

    }

    public int getHorsePower(){
        return this.horsePower;

    }

    public FuelType getFuelType (){
        return fuelType;
    }

    @Override
    public String toString(){
        {
            String enginedesc = "Uses" + " " + fuelType + ", " + noOfCylinders + "cylinders," + " " + capacity + " cc," + " " + horsePower + " hp," + " " + mpg + " " + "average mpg.";

            return enginedesc;
        }


    }
}
enum FuelType {Gas, Electric, Hybrid, Diesel}

