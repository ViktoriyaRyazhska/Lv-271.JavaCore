package com.company.lesson5;

public class Car {

    /*
    Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
certain model year  (enter year in the console);
ordered by the field year.

     */

private String type;
private int productionYear;
private int engineCapacity;

    public Car (String type, int productionYear, int engineCapacity){
        this.engineCapacity = engineCapacity;
        this.productionYear = productionYear;
        this.type = type;
        }

    public String getType(){
            return this.type;
    }

    public int getProductionYear(){
            return this.productionYear;
    }

    public int getEngineCapacity(){
        return this.engineCapacity;
    }
    @Override
    public String toString(){
        return  "Car type: " + type + ", year: " + productionYear + ", capacity: " + engineCapacity;
    }

}
