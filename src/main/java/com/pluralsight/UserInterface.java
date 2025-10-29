package com.pluralsight;

public  class UserInterface {

    private Dealership dealership;

    private Scanner scanner;


    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }


    public void display() {
        init();


        boolean running = true;

        while (running){
            displayMenu();
            int choice = scanner.nextInt();

            scanner.nextLine();

            switch(choice){
                case 1-> processGetByPriceRequest();
                case 2-> processGetByMakeModelRequest();
                case 3 -> processGetByYearRequest();
                case 4 -> processByColorRequest();
                case 5 -> processGetByMileageRequest();
                case 6 -> processGetByVehicleTypeRequest();
                case 7 -> processGetAllVehiclesRequest();
                case 8 -> processAddVehicleRequest();
                case 9 -> processRemoveVehicleRequest();
                case 99 -> {
                    System.out.println("\nThank you for visiting "+ dealership.getName()+"!");
                    running= false;
                }

                default -> System.out.println("invalid choice ");

            }
        }
        scanner.close();


    }

    private void processGetByMileageRequest() {
    }

    private void init(){
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership("inventory.csv");


        System.out.println("\n----------------------------------------------------------------------");
        System.out.println("                WELCOME TO"+  dealership.getName()+"|");
        System.out.println("-------------------------------------------------------------------------");

    }
    private void displayMenu() {

        System.out.println("\n--------------------------------------------------------------------------");
        System.out.println("                              DEALERSHIP MENU");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("      1:    Find Vehicles By Price");
        System.out.println("      2:    Find Vehicles By Make/Model");
        System.out.println("      3:    Find Vehicles By Year");
        System.out.println("      4:    Find Vehicles By Color");
        System.out.println("      5:    Find Vehicle By Mileage");
        System.out.println("      6:    Find Vehicles By Type");
        System.out.println("      7:    List All Vehicles ");
        System.out.println("      8:    Add a Vehicle");
        System.out.println("      9:    Remove A Vehicle ");
        System.out.println("     99:    Quit");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("   Enter Your Choice");


    }
    private void displayVehicles(ArrayList<Vehicle>vehicles){
        if(vehicles.isEmpty()){
            System.out.println("\n  No vehicles found matching the criteria ");
            return;
        }
        System.out.println("\n"+"-".repeat(100));
        System.out.println("Found"+ vehicles);
        System.out.println("-".repeat(100));


        for(Vehicle vehicle: vehicles){
            System.out.printf("VIN: %-6d  |   %d  %-10s  %-10s |  %-8s  |  %-10s   |   %,6d mi   | $%,.2f%n",
                    vehicle.getVIN(),
                    vehicle.getYear(),
                    vehicle.getMake(),
                    vehicle.getModel(),
                    vehicle.getColor(),
                    vehicle.getVehicleType(),
                    vehicle.getOdometer(),
                    vehicle.getPrice());
        }
        System.out.println("-".repeat(100));
    }

    private void processGetAllVehiclesRequest() {
        System.out.println("\n  Displaying all vehicles in inventory");

        ArrayList<Vehicle>AllVehicles = dealership.getAllVehicles();

        displayVehicles(AllVehicles);
    }

    private void processGetByVehicleTypeRequest() {
        ArrayList<Vehicle>VehicleType = dealership.getVehicleByType();

        displayVehicles(VehicleType);


    }

    private void processGetByMileageRequest(int min, int max) {
        ArrayList<Vehicle>Mileage = dealership.getVehicleByMilage(min, max);

        displayVehicles(Mileage);
    }

    private void processByColorRequest() {

        ArrayList<Vehicle> Color = dealership.getVehicleByColor();

        displayVehicles(Color);
    }




}
private static void processGetByPriceRequest(){


}

private static void processGetByMakeModelRequest(){

}

private static void processGetByYearRequest(){

}




private static void processAddVehicleRequest(){

}

private static void processRemoveVehicleRequest(){

}






