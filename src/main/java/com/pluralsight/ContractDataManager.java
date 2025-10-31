package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ContractDataManager {

    private static final String CONTRACT_FILE = "inventory.csv";

    private void SaveContract(Contract contract) throws IOException {

        try(PrintWriter pw = new PrintWriter(new FileWriter(CONTRACT_FILE,true))){

            Vehicle v = contract.getVehicleSold();
            String baseInfo = String.format("%s|%5|%5|%d|%d|%s|%5|%6|%5|%d|%.2f",
                    (contract instanceof SalesContract) ? "Sale":"Lease",
                    contract.getDate(),
                    contract.getName(),
                    contract.getEmail(),
                    v.getVin(),
                    v.getYear(),
                    v.getMake(),
                    v.getModel(),
                    v.getVehicleType(),
                    v.getColor(),
                    v.getPrice(),
                    v.getOdometer());

            if (contract instanceof SalesContract) {
                SalesContract salesContract = (SalesContract) contract;
                pw.printf("%s|%.2f|%b|%.2f|%.2f%n",
                        baseInfo,
                        salesContract.getTotalPrice(),
                        salesContract.geMonthlyPrice(),
                        salesContract.isWantToFinance());
            } else if (contract instanceof SalesContract) {
                LeaseContract leaseContract = (LeaseContract)contract;
                pw.printf("%s|%.2f|%.2f%n",
                        baseInfo,
                        leaseContract.getTotalPrice(),
                        leaseContract.geMonthlyPrice());

            }

        } catch (IOException e){
            System.out.println("Error saving contract"+e.getMessage());
        }
        }
    }

