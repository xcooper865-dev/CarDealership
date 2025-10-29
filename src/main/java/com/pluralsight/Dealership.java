package com.pluralsight;

import java.util.ArrayList;

import static java.awt.AWTEventMulticaster.add;

public class Dealership {
    private String name;
    private String address;
    private String Phone;
    private ArrayList<Vehicle> inventory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        Phone = phone;
        this.inventory  = new ArrayList<>();

    }


    public ArrayList<Vehicle> getVehicleByPrice(double min, double max) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                result.add(vehicle);
            }
        }
        return result;

    }


    public ArrayList<Vehicle>  getVehicleByMakeModel(String make,String model) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Vehicle vehicle :inventory){
            if(vehicle.getMake().equalsIgnoreCase(make)&&
            vehicle.getModel().equalsIgnoreCase(model)){
                result.add(vehicle);
            }
        }
        return result;

    }

    public ArrayList<Vehicle> getVehicleByYear(int min, int max) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Vehicle vehicle : inventory){
            if(vehicle.getYear()>= min && vehicle.getYear()<= max){
                result.add(vehicle);
            }
        }
        return result;

    }

    public ArrayList<Vehicle> getVehicleByColor() {
        ArrayList<Vehicle> result = new ArrayList<>();

        for(Vehicle vehicle : inventory){
            if(vehicle.getColor().equalsIgnoreCase()){
               result.add(vehicle);
            }

        }
        return result;

    }
    public ArrayList<Vehicle> getVehicleByMilage(int min, int max){
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Vehicle vehicle :  inventory){
            if (vehicle.getOdometer()>= min&& vehicle.getOdometer()<= max){
                result.add(vehicle);

            }
        }
        return result;

    }
    public ArrayList<Vehicle> getVehicleByType(){
        ArrayList<Vehicle> result = new ArrayList<>();
        for(Vehicle vehicle : inventory){
            if (vehicle.getVehicleType().equalsIgnoreCase(String.valueOf(vehicle))){
                //come back to this
            }
            result.add(vehicle);

        }

    return result;
}
    public ArrayList<Vehicle> getAllVehicles(){
        return inventory;



    }
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);

    }
    public void RemoveVehicle(Vehicle vehicle){
        inventory.remove(vehicle);

    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
         }


    }


