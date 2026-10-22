package manager;

import problemdomain.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class VehicleManager {
    //constants
    private final String FILE_NAME = "res/vehicles.txt";
    //attributes
    private ArrayList<Vehicle> vehicles;
    private Scanner keyboard = new Scanner(System.in);

    public VehicleManager() {
        loadVehiclesList();
    }
    //loadingFromDataFile into an ArrayList
    //displayMenu to display UI menu
    //savingDataToFile

    private void loadVehiclesList() {
        vehicles = new ArrayList<>();
        try (Scanner inFile = new Scanner(new File(FILE_NAME))) {
            while (inFile.hasNextLine()) {
                String line = inFile.nextLine();
                // Note: Check if your employees.txt uses ";" or "," as the delimiter
                String[] parts = line.split(";");
                String carID = parts[0];
                char firstDigit = carID.charAt(0);

                switch (firstDigit) {
                    case '1':
                        Sedan sedan = new Sedan(
                                Long.parseLong(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]),
                                Double.parseDouble(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6]),
                                parts[7], Integer.parseInt(parts[8]), Integer.parseInt(parts[9]), parts[10]
                        );
                        vehicles.add(sedan);
                        break;

                    case '2':
                        Hatchback hatchback = new Hatchback(
                                Long.parseLong(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]),
                                Double.parseDouble(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6]),
                                parts[7], Integer.parseInt(parts[8]), Integer.parseInt(parts[9]), parts[10]
                        );
                        vehicles.add(hatchback);
                        break;

                    case '3':
                        SUV suv = new SUV(
                                Long.parseLong(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]),
                                Double.parseDouble(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6]),
                                parts[7], Integer.parseInt(parts[8]), Integer.parseInt(parts[9])
                        );
                        vehicles.add(suv);
                        break;

                    case '4':
                    case '5':
                        Hybrid hybrid = new Hybrid(
                                Long.parseLong(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]),
                                Double.parseDouble(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6]),
                                parts[7], Integer.parseInt(parts[8]), Integer.parseInt(parts[9]), parts[10], Integer.parseInt(parts[11])
                        );
                        vehicles.add(hybrid);
                        break;

                    case '6':
                        PickupTruck pickupTruck = new PickupTruck(
                                Long.parseLong(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]),
                                Double.parseDouble(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6]),
                                parts[7], Integer.parseInt(parts[8]), Integer.parseInt(parts[9]), parts[10], Integer.parseInt(parts[11])
                        );
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
