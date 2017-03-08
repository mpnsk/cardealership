package carstuff;


public class Dealership {
    private final Car[] cars;
    private Car selectedCar;

    public Dealership() {
        if (true) {
            cars = Datasource.readCarsFromFile();
        } else {
            cars = Datasource.readCarsHardcoded();
        }
    }


    public String ListAllCars() {
        //Responsibility: returns a description of all cars
        String result = "";
        for (int i = 0; i < cars.length; i++) {

            Car c = cars[i];
            String s = c.toString();
            result = result + (i + 1) + "-" + s + "\n";
        }
        return result;
    }


    public String SelectCar(int index) {
        //Responsibility: selects the car at the selected index
        selectedCar = cars[index - 1];
        return selectedCar.toString();

    }

    public String CheckEngine() {
        if (selectedCar != null)
            return selectedCar.CheckEngine();
        else
            return "Please select a car first";
    }

    public String CheckInterior() {
        if (selectedCar != null)
            return selectedCar.CheckInterior();
        else
            return "Please select a car first";
    }

    public String OpenTrunk() {
        if (selectedCar != null)
            return selectedCar.OpenTrunk();
        else
            return "Please select a car first";

    }

    public String ShowOptions() {
        if (selectedCar != null)
            return selectedCar.ShowOptions();
        else
            return "Please select a car first";
    }

    public String Compare(int index1, int index2) {

        Car car1 = cars[index1 - 1];
        Car car2 = cars[index2 - 1];
        String carCompared = car1.CompareTo(car2);
        //if (cars != null)
        return carCompared;
        //else
        //return "Invalid input. Try again.";
    }

}
