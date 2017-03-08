package carstuff;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Car {
    private String make;
    private int year;
    private String model;
    private int price;
    private String color;
    private CarType type;
    private Engine engine;
    private Interior interior;
    private Trunk trunk;
    private Option[] options;
    ArrayList <Option> addopt;

    public Car (String make, int year, String model, int price, String color, CarType type){
        this.make = make;
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public Car (String make, int year, String model, int price, String color, CarType type,
                Engine engine, Interior interior, Trunk trunk){

        this(make, year, model, price, color, type);

        this.engine = engine;
        this.interior = interior;
        this.trunk = trunk;
    }

    public void SetEngine(Engine engine){
        this.engine = engine;
    }

    public void setInterior(Interior interior){
        this.interior = interior;
    }

    public void SetTrunk(Trunk trunk){
        this.trunk = trunk;
    }

    public void AddOption (Option options){
        this.addopt.add(options);
    }


    @Override
    public String toString(){
        String s = color + " " + year + " " + make + " " + model + " for $" + price;
        return s;
    }

    public String CheckEngine(){
        return engine.toString();
    }

    public String CheckInterior(){
        return interior.toString();
    }

    public String OpenTrunk(){
        return trunk.toString();

    }

    public String ShowOptions(){
        String optList = "";
        for(Option opt : addopt){
            optList += opt.toString() + "\n";
        }
        return optList;
    }

    public Option[] getOptions(){
        return options;
    }

    String CompareTo (Car car2) {
        String comparedMsg = " ";

        if(this.engine.getMpg() > car2.engine.getMpg())
            comparedMsg = this.make + " " + this.model +" has better mpg.\n";
        else if (this.engine.getMpg() < car2.engine.getMpg())
            comparedMsg = car2.make + " "+ car2.model +" has better mpg.\n";
        else
            comparedMsg = "Both car have the same mpg. \n";


        if (this.price > car2.price)
            comparedMsg += this.make + " " + this.model + " " + "is more expensive.\n";
        else if (this.price < car2.price)
            comparedMsg += car2.make + " " + car2.model + " " + "is more expensive.\n";


        if (this.options == car2.options)
            comparedMsg += this.make + " " + this.model + " has the same options.\n";
        else if (this.options != car2.options)
            comparedMsg += car2.model + " " + car2.make + " does not have the same options.\n";


        if (this.engine.getNoOfCylinders() > car2.engine.getNoOfCylinders())
            comparedMsg += this.make + " " + this.model + " has " + this.engine.getNoOfCylinders()+ " cylinders " + "while " + car2.make + " " + car2.model + " has " + car2.engine.getNoOfCylinders() + " cylinders.\n";
        else if (this.engine.getNoOfCylinders()< car2.engine.getNoOfCylinders())
            comparedMsg += this.make + " " + this.model + " has " + this.engine.getNoOfCylinders()+ " cylinders " + "while " + car2.make + " " + car2.model + " has " + car2.engine.getNoOfCylinders() + " cylinders.\n";
        else
            comparedMsg += "Both cars have same amount of cylinders.\n";



        if (this.engine.getHorsePower() > car2.engine.getHorsePower())
            comparedMsg += this.make + " " + this.model + " has more horsepower.\n";
        else if (this.engine.getHorsePower() < car2.engine.getHorsePower())
            comparedMsg += car2.make + " " + car2.model + " has more horsepower.\n";
        else
            comparedMsg += "Both cars have same horsepower.\n";

        if(this.engine.getFuelType() == car2.engine.getFuelType())
            comparedMsg += "Both cars run on " + this.engine.getFuelType() + "\n";
        else if (this.engine.getFuelType() != car2.engine.getFuelType())
            comparedMsg += this.make + " " + this.model + " run on " + this.engine.getFuelType() + " and " + car2.make + " " + car2.model + " runs on " + car2.engine.getFuelType() + ".\n";


        return comparedMsg;


    }
}

enum CarType {Sedan, SUV, CrossOver, Truck};
