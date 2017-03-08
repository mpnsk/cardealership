package carstuff;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by topsy on 08.03.17.
 */
class Datasource {
    static Car[] readCarsHardcoded() {
        Car[] cars = new Car[10];
        Engine engine = new Engine(FuelType.Gas, 4, 1493, 152, 38);
        Interior interior = new Interior("Black", "Gray", true, false);
        Trunk trunk = new Trunk(true, true, true, true, "Black");
        Car Subaru = new Car("Subaru", 2007, "Impreza", 10000, "Red", CarType.Sedan, engine, interior, trunk);
        ArrayList<Option> subaruimpreza = new ArrayList<>();
        Option subaruimpreza1 = new Option("Power Windows", "windows can be raised and lowered by pressing a button or switch");
        Option subaruimpreza2 = new Option("Power Door Locks", "simultaneously lock or unlock all the doors of an automobile.");
        Option subaruimpreza3 = new Option("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        subaruimpreza.add(subaruimpreza1);
        subaruimpreza.add(subaruimpreza2);
        subaruimpreza.add(subaruimpreza3);
        Subaru.addopt = subaruimpreza;

        cars[0] = Subaru;

        engine = new Engine(FuelType.Gas, 4, 1998, 168, 27);
        interior = new Interior("Black", "Gray", false, true);
        trunk = new Trunk(true, true, true, true, "Gray");
        Car Mitsubishi = new Car("Mitsubishi", 2008, "Lancer", 11000, "Yellow", CarType.Sedan, engine, interior, trunk);
        ArrayList<Option> mitsubishilancer = new ArrayList<>();
        Option mitsubishilancer1 = new Option("Power Windows", " windows can be raised and lowered by pressing a button or switch");
        Option mitsubishilancer2 = new Option("Power Door Locks", "simultaneously lock or unlock all the doors of an automobile.");
        Option mitsubishilancer3 = new Option("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        mitsubishilancer.add(mitsubishilancer1);
        mitsubishilancer.add(mitsubishilancer2);
        mitsubishilancer.add(mitsubishilancer3);
        Mitsubishi.addopt = mitsubishilancer;

        cars[1] = Mitsubishi;

        engine = new Engine(FuelType.Gas, 4, 1596, 180, 32);
        interior = new Interior("Black", "Gray", false, false);
        trunk = new Trunk(true, true, true, true, "Gray");
        Car Honda = new Car("Honda", 2009, "Civic", 13000, "Silver", CarType.Sedan, engine, interior, trunk);
        ArrayList<Option> hondacivic = new ArrayList<>();
        Option hondacivic1 = new Option("Power Windows", " windows can be raised and lowered by pressing a button or switch");
        Option hondacivic2 = new Option("Power Door Locks", "simultaneously lock or unlock all the doors of an automobile.");
        Option hondacivic3 = new Option("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        hondacivic.add(hondacivic1);
        hondacivic.add(hondacivic2);
        hondacivic.add(hondacivic3);
        Honda.addopt = hondacivic;

        cars[2] = Honda;

        engine = new Engine(FuelType.Gas, 8, 5328, 355, 16);
        interior = new Interior("Black", "Gray", false, false);
        trunk = new Trunk(true, true, true, true, "Gray");
        Car Chevrolet = new Car("Chevrolet", 2014, "Tahoe", 14000, "White", CarType.SUV, engine, interior, trunk);
        ArrayList<Option> chevrolettahoe = new ArrayList<>();
        Option chevrolettahoe1 = new Option("Keyless Entry", " Electronic lock that controls access to your vehicle without using a traditional mechanical key");
        Option chevrolettahoe2 = new Option("Privacy Window", "Wireless technology that allows two compatible devices to communicate");
        Option chevrolettahoe3 = new Option("Seat Warmers", "Heats up your seat with the push of a button");
        chevrolettahoe.add(chevrolettahoe1);
        chevrolettahoe.add(chevrolettahoe2);
        chevrolettahoe.add(chevrolettahoe3);
        Chevrolet.addopt = chevrolettahoe;

        cars[3] = Chevrolet;

        engine = new Engine(FuelType.Gas, 8, 4134, 280, 23);
        interior = new Interior("Black", "Tan", true, false);
        trunk = new Trunk(true, true, true, true, "Black");
        Car Volkswagen = new Car("Volkswagen", 2015, "Touareg", 15000, "Blue", CarType.SUV, engine, interior, trunk);
        ArrayList<Option> volkswagentouareg = new ArrayList<>();
        Option volkswagentouareg1 = new Option("Keyless Entry", " Electronic lock that controls access to your vehicle without using a traditional mechanical key");
        Option volkswagentouareg2 = new Option("Privacy Window", "Wireless technology that allows two compatible devices to communicate");
        Option volkswagentouareg3 = new Option("Seat Warmers", "Heats up your seat with the push of a button");
        volkswagentouareg.add(volkswagentouareg1);
        volkswagentouareg.add(volkswagentouareg2);
        volkswagentouareg.add(volkswagentouareg3);
        Volkswagen.addopt = volkswagentouareg;

        cars[4] = Volkswagen;

        engine = new Engine(FuelType.Gas, 8, 5137, 285, 20);
        interior = new Interior("Black", "Brown", false, false);
        trunk = new Trunk(true, true, false, true, "Black");
        Car Jeep = new Car("Jeep", 2010, "Wrangler", 16000, "Black", CarType.SUV, engine, interior, trunk);
        ArrayList<Option> jeepwrangler = new ArrayList<>();
        Option jeepwrangler1 = new Option("Power Windows", " windows can be raised and lowered by pressing a button or switch");
        Option jeepwrangler2 = new Option("Power Door Locks", "simultaneously lock or unlock all the doors of an automobile.");
        Option jeepwrangler3 = new Option("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        jeepwrangler.add(jeepwrangler1);
        jeepwrangler.add(jeepwrangler2);
        jeepwrangler.add(jeepwrangler3);
        Jeep.addopt = jeepwrangler;

        cars[5] = Jeep;

        engine = new Engine(FuelType.Gas, 6, 2359, 240, 23);
        interior = new Interior("Black", "Gray", false, false);
        trunk = new Trunk(true, true, true, true, "Black");
        Car Kia = new Car("Kia", 2013, "Sportage", 17000, "White", CarType.CrossOver, engine, interior, trunk);
        ArrayList<Option> kiasportage = new ArrayList<>();
        Option kiasportage1 = new Option("Power Windows", " windows can be raised and lowered by pressing a button or switch");
        Option kiasportage2 = new Option("Power Door Locks", "simultaneously lock or unlock all the doors of an automobile.");
        Option kiasportage3 = new Option("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        kiasportage.add(kiasportage1);
        kiasportage.add(kiasportage2);
        kiasportage.add(kiasportage3);
        Kia.addopt = kiasportage;

        cars[6] = Kia;

        engine = new Engine(FuelType.Gas, 6, 2995, 272, 22);
        interior = new Interior("Black", "Gray", false, false);
        trunk = new Trunk(true, true, true, true, "Black");
        Car Audi = new Car("Audi", 2011, "Q5", 18000, "Red", CarType.CrossOver, engine, interior, trunk);
        ArrayList<Option> audiq5 = new ArrayList<>();
        Option audiq51 = new Option("Power Windows", " windows can be raised and lowered by pressing a button or switch");
        Option audiq52 = new Option("Power Door Locks", "simultaneously lock or unlock all the doors of an automobile.");
        Option audiq53 = new Option("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        audiq5.add(audiq51);
        audiq5.add(audiq52);
        audiq5.add(audiq53);
        Audi.addopt = audiq5;


        cars[7] = Audi;

        engine = new Engine(FuelType.Gas, 8, 5321, 400, 19);
        interior = new Interior("Black", "Gray", false, false);
        trunk = new Trunk(true, true, false, false, "Black");
        Car Ford = new Car("Ford", 1995, "F-150", 19000, "Black", CarType.Truck, engine, interior, trunk);
        ArrayList<Option> fordf150 = new ArrayList<>();
        Option fordf1501 = new Option("Power Windows", " windows can be raised and lowered by pressing a button or switch");
        Option fordf1502 = new Option("Power Door Locks", "simultaneously lock or unlock all the doors of an automobile.");
        Option fordf1503 = new Option("Trailer Hitch", "a device attached to the chassis of a vehicle for towing.");
        fordf150.add(fordf1501);
        fordf150.add(fordf1502);
        fordf150.add(fordf1503);
        Ford.addopt = fordf150;

        cars[8] = Ford;

        engine = new Engine(FuelType.Gas, 6, 2499, 278, 19);
        interior = new Interior("Black", "Black", false, false);
        trunk = new Trunk(true, false, false, false, "Black");
        Car Toyota = new Car("Toyota", 2001, "Tacoma", 20000, "Green", CarType.Truck, engine, interior, trunk);
        ArrayList<Option> toyotatacoma = new ArrayList<>();
        Option toyotatacoma1 = new Option("Keyless Entry", " Electronic lock that controls access to your vehicle without using a traditional mechanical key");
        Option toyotatacoma2 = new Option("Privacy Window", "Wireless technology that allows two compatible devices to communicate");
        Option toyotatacoma3 = new Option("Navigation System", "Heats up your seat with the push of a button");
        toyotatacoma.add(toyotatacoma1);
        toyotatacoma.add(toyotatacoma2);
        toyotatacoma.add(toyotatacoma3);
        Toyota.addopt = toyotatacoma;

        cars[9] = Toyota;
        return cars;
    }

   static Car[] readCarsFromFile() {
       // This is bad! Should be some kind of Collection instead!
       Car[] tooBigCarArray = new Car[100];
       Car[] adjustedCarArray = null;

       try {
           String rdline = "";
           FileReader reader = new FileReader("CISCDAppII.txt");
           BufferedReader br = new BufferedReader(reader);
           rdline = br.readLine();
           int i = 0;
           while ((rdline != null)) {
               String[] parts = rdline.split(",");

               String make = String.valueOf(parts[0]);
               int year = Integer.parseInt(parts[1]);
               String model = String.valueOf(parts[2]);
               int price = Integer.parseInt(parts[3]);
               String color = String.valueOf(parts[4]);
               CarType type = CarType.valueOf(parts[5]);
               FuelType fuelType = FuelType.valueOf(parts[6]);
               int noOfCylinders = Integer.parseInt(parts[7]);
               int capacity = Integer.parseInt(parts[8]);
               int horsePower = Integer.parseInt(parts[9]);
               float mpg = Float.parseFloat(parts[10]);
               Boolean b = Boolean.valueOf(parts[11]);
               Boolean b1 = Boolean.valueOf(parts[12]);
               Boolean b2 = Boolean.valueOf(parts[13]);
               Boolean b3 = Boolean.valueOf(parts[14]);
               String gray = String.valueOf(parts[15]);
               String color1 = String.valueOf(parts[16]);
               String color2 = String.valueOf(parts[17]);
               Boolean hasSunRoof = Boolean.valueOf(parts[18]);
               Boolean hasMoonRoof = Boolean.valueOf(parts[19]);
               Option options1 = new Option(String.valueOf(parts[20]), String.valueOf(parts[21]));
               Option options2 = new Option(String.valueOf(parts[22]), String.valueOf(parts[23]));
               Option options3 = new Option(String.valueOf(parts[24]), String.valueOf(parts[25]));

               Engine engine = new Engine(fuelType, noOfCylinders, capacity, horsePower, mpg);
               Interior interior = new Interior(color1, color2, hasSunRoof, hasMoonRoof);
               Trunk trunk = new Trunk(b, b1, b2, b3, gray);
               Car car = new Car(make, year, model, price, color, type);
               car.setInterior(interior);
               car.SetEngine(engine);
               car.SetTrunk(trunk);
               car.AddOption(options1);
               car.AddOption(options2);
               car.AddOption(options3);

               tooBigCarArray[i] = car;
               i++;
               rdline = br.readLine();
           }
           adjustedCarArray = Arrays.copyOf(tooBigCarArray, i);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
       return adjustedCarArray;
   }
}
