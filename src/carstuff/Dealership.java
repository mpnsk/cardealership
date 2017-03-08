package carstuff;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Dealership {
    private final Car[] cars;
    private Car selectedCar;

    public Dealership(){

        cars = new Car[10];
        /*
        BufferedReader br = null;

            try {
                String rdline = "";

                br = new BufferedReader(new FileReader("CISCDAppII.txt"));
                rdline = br.readLine ();
                String [] parts = rdline.split (",");
                    while ((rdline != null)) {

                        Engine engine = new Engine(FuelType.valueOf(parts[6]), Integer.parseInt(parts[7]), Integer.parseInt(parts[8]), Integer.parseInt(parts[9]), Float.parseFloat(parts[10]));
                        Interior interior = new Interior(String.valueOf(parts[16]),String.valueOf(parts[17]),Boolean.valueOf(parts[18]), Boolean.valueOf(parts[19]));
                        Trunk trunk = new Trunk(Boolean.valueOf(parts[11]), Boolean.valueOf(parts[12]), Boolean.valueOf(parts[13]), Boolean.valueOf(parts[14]), String.valueOf(parts[15]));
                        Car car = new Car(String.valueOf(parts[0]), Integer.parseInt(parts[1]), String.valueOf(parts[2]), Integer.parseInt(parts[4]), String.valueOf(parts[3]), CarType.valueOf(parts[5]));
                        Option options1 = new Option(String.valueOf(parts[20]), String.valueOf(parts[21]));
                        Option options2 = new Option(String.valueOf(parts[22]), String.valueOf(parts[23]));
                        Option options3 = new Option(String.valueOf(parts[24]), String.valueOf(parts[25]));

                        for (int i = 0; i < cars.length; i++) {
                        cars[i] = car;
                        rdline = br.readLine();
                        }
                    }
                } catch (FileNotFoundExceptoin ex1) {
                    ex1.getMessage();
                } catch (IOException ex2) {
                ex2.getMessage();
                }

        */
        Engine engine = new Engine(FuelType.Gas, 4, 1493, 152, 38);
        Interior interior = new Interior("Black","Gray",true, false);
        Trunk trunk = new Trunk(true, true, true, true, "Black");
        Car Subaru = new Car("Subaru", 2007, "Impreza", 10000, "Red", CarType.Sedan, engine, interior, trunk);
        ArrayList <Option> subaruimpreza = new ArrayList<>();
        Option subaruimpreza1 = new Option("Power Windows","windows can be raised and lowered by pressing a button or switch");
        Option subaruimpreza2= new Option("Power Door Locks","simultaneously lock or unlock all the doors of an automobile." );
        Option subaruimpreza3 = new Option ("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        subaruimpreza.add(subaruimpreza1);
        subaruimpreza.add(subaruimpreza2);
        subaruimpreza.add(subaruimpreza3);
        Subaru.addopt = subaruimpreza;

        cars[0] = Subaru;

        engine = new Engine(FuelType.Gas, 4, 1998, 168, 27);
        interior = new Interior("Black","Gray",false, true);
        trunk = new Trunk(true, true, true, true, "Gray");
        Car Mitsubishi = new Car("Mitsubishi", 2008, "Lancer", 11000, "Yellow", CarType.Sedan, engine, interior, trunk);
        ArrayList <Option> mitsubishilancer = new ArrayList<>();
        Option mitsubishilancer1 = new Option("Power Windows"," windows can be raised and lowered by pressing a button or switch");
        Option mitsubishilancer2= new Option("Power Door Locks","simultaneously lock or unlock all the doors of an automobile." );
        Option mitsubishilancer3 = new Option ("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        mitsubishilancer.add(mitsubishilancer1);
        mitsubishilancer.add(mitsubishilancer2);
        mitsubishilancer.add(mitsubishilancer3);
        Mitsubishi.addopt = mitsubishilancer;

        cars[1] = Mitsubishi;

        engine = new Engine(FuelType.Gas, 4, 1596, 180, 32);
        interior = new Interior("Black","Gray",false, false);
        trunk = new Trunk(true, true, true, true, "Gray");
        Car Honda = new Car("Honda", 2009, "Civic", 13000, "Silver", CarType.Sedan, engine, interior, trunk);
        ArrayList <Option> hondacivic = new ArrayList<>();
        Option hondacivic1 = new Option("Power Windows"," windows can be raised and lowered by pressing a button or switch");
        Option hondacivic2= new Option("Power Door Locks","simultaneously lock or unlock all the doors of an automobile." );
        Option hondacivic3 = new Option ("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        hondacivic.add(hondacivic1);
        hondacivic.add(hondacivic2);
        hondacivic.add(hondacivic3);
        Honda.addopt = hondacivic;

        cars[2] = Honda;

        engine = new Engine(FuelType.Gas, 8, 5328, 355, 16);
        interior = new Interior("Black","Gray",false, false);
        trunk = new Trunk(true, true, true, true, "Gray");
        Car Chevrolet = new Car("Chevrolet", 2014, "Tahoe", 14000, "White", CarType.SUV, engine, interior, trunk);
        ArrayList <Option> chevrolettahoe = new ArrayList<>();
        Option chevrolettahoe1 = new Option("Keyless Entry"," Electronic lock that controls access to your vehicle without using a traditional mechanical key");
        Option chevrolettahoe2= new Option("Privacy Window","Wireless technology that allows two compatible devices to communicate" );
        Option chevrolettahoe3 = new Option ("Seat Warmers", "Heats up your seat with the push of a button");
        chevrolettahoe.add(chevrolettahoe1);
        chevrolettahoe.add(chevrolettahoe2);
        chevrolettahoe.add(chevrolettahoe3);
        Chevrolet.addopt = chevrolettahoe;

        cars[3] = Chevrolet;

        engine = new Engine(FuelType.Gas, 8, 4134, 280, 23);
        interior = new Interior("Black", "Tan",true, false);
        trunk = new Trunk(true, true, true, true, "Black");
        Car Volkswagen = new Car("Volkswagen", 2015, "Touareg", 15000, "Blue", CarType.SUV, engine, interior, trunk);
        ArrayList <Option> volkswagentouareg = new ArrayList<>();
        Option volkswagentouareg1 = new Option("Keyless Entry"," Electronic lock that controls access to your vehicle without using a traditional mechanical key");
        Option volkswagentouareg2= new Option("Privacy Window","Wireless technology that allows two compatible devices to communicate" );
        Option volkswagentouareg3 = new Option ("Seat Warmers", "Heats up your seat with the push of a button");
        volkswagentouareg.add(volkswagentouareg1);
        volkswagentouareg.add(volkswagentouareg2);
        volkswagentouareg.add(volkswagentouareg3);
        Volkswagen.addopt = volkswagentouareg;

        cars[4] = Volkswagen;

        engine = new Engine(FuelType.Gas, 8, 5137, 285, 20);
        interior = new Interior("Black","Brown",false, false);
        trunk = new Trunk(true, true, false, true, "Black");
        Car Jeep = new Car("Jeep", 2010, "Wrangler", 16000, "Black", CarType.SUV, engine, interior, trunk);
        ArrayList <Option> jeepwrangler = new ArrayList<>();
        Option jeepwrangler1 = new Option("Power Windows"," windows can be raised and lowered by pressing a button or switch");
        Option jeepwrangler2= new Option("Power Door Locks","simultaneously lock or unlock all the doors of an automobile." );
        Option jeepwrangler3 = new Option ("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        jeepwrangler.add(jeepwrangler1);
        jeepwrangler.add(jeepwrangler2);
        jeepwrangler.add(jeepwrangler3);
        Jeep.addopt = jeepwrangler;

        cars[5] = Jeep;

        engine = new Engine(FuelType.Gas, 6, 2359, 240, 23);
        interior = new Interior("Black","Gray",false, false);
        trunk = new Trunk(true, true, true, true, "Black");
        Car Kia = new Car("Kia", 2013, "Sportage", 17000, "White", CarType.CrossOver, engine, interior, trunk);
        ArrayList <Option> kiasportage = new ArrayList<>();
        Option kiasportage1 = new Option("Power Windows"," windows can be raised and lowered by pressing a button or switch");
        Option kiasportage2= new Option("Power Door Locks","simultaneously lock or unlock all the doors of an automobile." );
        Option kiasportage3 = new Option ("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        kiasportage.add(kiasportage1);
        kiasportage.add(kiasportage2);
        kiasportage.add(kiasportage3);
        Kia.addopt = kiasportage;

        cars[6] = Kia;

        engine = new Engine(FuelType.Gas, 6, 2995, 272, 22);
        interior = new Interior("Black","Gray",false, false);
        trunk = new Trunk(true, true, true, true, "Black");
        Car Audi = new Car("Audi", 2011, "Q5", 18000, "Red", CarType.CrossOver, engine, interior, trunk);
        ArrayList <Option> audiq5 = new ArrayList<>();
        Option audiq51 = new Option("Power Windows"," windows can be raised and lowered by pressing a button or switch");
        Option audiq52= new Option("Power Door Locks","simultaneously lock or unlock all the doors of an automobile." );
        Option audiq53 = new Option ("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        audiq5.add(audiq51);
        audiq5.add(audiq52);
        audiq5.add(audiq53);
        Audi.addopt = audiq5;


        cars[7] = Audi;

        engine = new Engine(FuelType.Gas, 8, 5321, 400, 19);
        interior = new Interior("Black","Gray",false, false);
        trunk = new Trunk(true, true, false, false, "Black");
        Car Ford = new Car("Ford", 1995, "F-150", 19000, "Black", CarType.Truck, engine, interior, trunk);
        ArrayList <Option> fordf150 = new ArrayList<>();
        Option fordf1501 = new Option("Power Windows"," windows can be raised and lowered by pressing a button or switch");
        Option fordf1502= new Option("Power Door Locks","simultaneously lock or unlock all the doors of an automobile." );
        Option fordf1503 = new Option ("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        fordf150.add(fordf1501);
        fordf150.add(fordf1502);
        fordf150.add(fordf1503);
        Ford.addopt = fordf150;

        cars[8] = Ford;

        engine = new Engine(FuelType.Gas, 6, 2499, 278, 19);
        interior = new Interior("Black", "Black", false, false);
        trunk = new Trunk(true, false, false, false, "Black");
        Car Toyota= new Car("Toyota", 2001, "Tacoma", 20000, "Green", CarType.Truck, engine, interior, trunk);
        ArrayList <Option> toyotatacoma = new ArrayList<>();
        Option toyotatacoma1 = new Option("Keyless Entry"," Electronic lock that controls access to your vehicle without using a traditional mechanical key");
        Option toyotatacoma2 = new Option("Privacy Window","Wireless technology that allows two compatible devices to communicate" );
        Option toyotatacoma3 = new Option ("Navigation System", "Heats up your seat with the push of a button");
        toyotatacoma.add(toyotatacoma1);
        toyotatacoma.add(toyotatacoma2);
        toyotatacoma.add(toyotatacoma3);
        Toyota.addopt = toyotatacoma;

        cars[9] = Toyota;


    }


    public String ListAllCars(){
        //Responsibility: returns a description of all cars
        String result = "";
        for(int i = 0; i < cars.length; i++){

            Car c = cars[i];
            String s = c.toString();
            result = result + (i+1) + "-" + s + "\n";
        }
        return result;
    }


    public String SelectCar (int index){
        //Responsibility: selects the car at the selected index
        selectedCar =  cars[index - 1];
        return selectedCar.toString();

    }

    public String CheckEngine(){
        if(selectedCar != null)
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

    public String Compare( int index1, int index2) {

        Car car1 = cars [index1 -1];
        Car car2 = cars [index2 -1];
        String carCompared = car1.CompareTo( car2 );
        //if (cars != null)
        return carCompared;
        //else
        //return "Invalid input. Try again.";
    }

}