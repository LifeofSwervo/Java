/**
 * Hospital Patient system runner. Use this to test your assignment 8
 * @author Lucas Hartman
 * @version 1.1.0
 *
 * Added in the Visit, made some variables static to help with usage
 *
*/
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class HospitalSystemV2 {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Patient> patientList = new ArrayList<>();

    public static void main(String[] args) {


        // put in some sample invoices
        patientList.add(new Patient(3781, "Bruce", "Banner", "890 5th Ave, Manhattan, New York 10451", "Male", 128, new int[]{5, 8}, new String[]{"12", "18", "1969"}, "HLK0519623596"));
        patientList.add(new Patient(5632, "Tony", "Stark", "10880 Malibu Point, Malibu, CA 90265", "Male", 185, new int[]{5, 9}, new String[]{"05", "29", "1970"}, "IM1100442092"));
        patientList.add(new Patient(6541, "Scott", "Lang", "601 Buena Vista Avenue West, Buena Vista, CA 95640", "Male", 185, new int[]{6, 0}, new String[]{"08", "02", "1968"}, "AM526980025"));

        // loop through menu
        int choice = 0;
        while(choice != 7)
        {
            System.out.println("** Mirthful Hospital System **\n");
            System.out.println("1. List Patients");
            System.out.println("2. Add Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. Modify Patient");
            System.out.println("5. New Patient Checkin");
            System.out.println("6. Patient Visit");
            System.out.println("7. Exit");

            // get input and check valid range
            choice = getInt("Choice: ");
            while (choice < 1 || choice > 7)
            {
                choice = getInt("Choice: ");
            }
            System.out.println(); // add blank line
            switch(choice)
            {
                case 1 -> printPatients();
                case 2 -> addPatient();
                case 3 -> deletePatient();
                case 4 -> modifyPatient();
                case 5 -> patientCheckIn();
                case 6 -> patientVisit();
            }
            System.out.println(); // insert blank line between each
        }
    }

    private static void patientVisit() {
        System.out.println("** Visit **");
        int index = searchPatient(patientList, "visit"); // search
        // print invoice
        Patient current = patientList.get(index);

        // print patient history
        current.printPatientHistory();
        
        LocalDate today = LocalDate.now();
        String date = today.getMonthValue() + "/" + today.getDayOfMonth() + "/" + today.getYear();
        System.out.println("Date: " + date);
        System.out.print("Doctor: ");
        String doctor = input.nextLine();
        double weight = getDouble("Enter weight: ");
        System.out.println("Enter in height(feet then inches): ");
        int feet = getInt("Enter feet: ");
        int inches = getInt("Enter inches: ");
        System.out.println("Enter visit info: ");
        String visit = input.nextLine();
        System.out.print("Prescriptions: ");
        String rx = input.nextLine();

        // create visit
        Visit newVisit = new Visit(date, doctor, weight, new int[]{feet, inches}, visit, rx);
        // add visit to patient
        current.addNewVisit(newVisit);


        System.out.println("Visit information added");
    }

    /**
     * When the patient arrives we fill in the rest of the data.
     */
    private static void patientCheckIn() {

        int index = searchPatient(patientList, "check-in"); // search
        // print invoice
        Patient current = patientList.get(index);

        System.out.println("* Patient Check In *");
        System.out.print("Enter Date of Birth(MM/DD/YYYY): ");
        String dob = input.nextLine();
        System.out.print("Enter State ID: ");
        String id = input.nextLine();

        current.setDateOfBirth(dob.split("/"));
        current.setStateID(id);

        System.out.println("\nPatient Checked In\n");

    }

    /**
     * Modify basic information of the patient as it changes.
     *
     */
    private static void modifyPatient() {
        // search patients
        int index = searchPatient(patientList, ("modify")); // search
        // get patient and print
        Patient current = patientList.get(index);
        current.printPatient();
        System.out.println(); // insert blank line


        // print options
        System.out.println("Choose options for modifying");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Address");
        System.out.println("4. Gender");

        // get input and valid through the menu
        int choice = getInt("Choice: ");
        while (choice < 1 || choice > 4)
        {
            choice = getInt("Choice: ");
        }

        System.out.println(); // insert blank line

        // get input for the change
        switch(choice)
        {
            case 1 -> {
                System.out.print("Enter updated name: ");
                String firstName = input.nextLine();
                current.setFirstName(firstName);
            }
            case 2 -> {
                System.out.print("Enter updated name: ");
                String lastName = input.nextLine();
                current.setLastName(lastName);
            }
            case 3 -> {
                System.out.print("Enter new address: ");
                String address = input.nextLine();
                current.setAddress(address);
            }
            case 4 -> {
                System.out.print("Enter new gender: ");
                String gender = input.nextLine();
                current.setGender(gender);
            }
        }

        System.out.println("Patient Updated\n");

    }

    /**
     * Search for a patient and delete.

     */
    private static void deletePatient() {
        int delete = searchPatient(patientList, "delete");

        patientList.remove(delete);
        System.out.println("Patient Deleted");
    }

    /**
     * Gets input to add a new patient. Only ID, name address and gender required. The rest get entered
     * when we check in the patient.
     *
     */
    private static void addPatient() {
        System.out.println("** Add Patient **");

        // get main data for both
        int id = getInt("Enter Patient ID: ");
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter address: ");
        String address = input.nextLine();
        System.out.print("Enter gender: ");
        String gender = input.nextLine();

        Patient p = new Patient(id, firstName, lastName, address, gender);
        patientList.add(p);

    }

    /**
     * Loops through all the invoices and calls the print methods
     */
    private static void printPatients() {
        System.out.println("** Patients **");
        for (Patient p : patientList) {
            p.printPatient();
            System.out.println();
        }
        System.out.println();
    }

    /**
     * This method will locate an employee in the list and return the index it is found at.
     *
     * @param patients ArrayList of employees
     * @param prompt String to print in the prompt
     * @return index location of found employee
     */
    private static int searchPatient(ArrayList<Patient> patients, String prompt)
    {

        // quick print for searching invoices
        System.out.println("ID:\t\tName");
        for (Patient p : patients)
        {
            System.out.println(p.getPatientID() + "\t" + p.getLastName() + ", " + p.getFirstName());
        }
        System.out.println(); // blank space

        // look for invoice search
        int index = -1;
        while(index == -1)
        {
            int searchID = getInt("Enter Patient ID to " + prompt + ": "); // get valid input

            // loop through invoices to search
            for (int i = 0; i < patients.size(); i++)
            {
                // if invoice found save index and break out of loop.
                if (patients.get(i).getPatientID() == searchID)
                {
                    index = i;
                    break;
                }
            }

            // error if can't find invoice
            if (index == -1)
            {
                System.out.println("Patient not found, search again");
            }
        }
        System.out.println(); // blank line
        return index;
    }


    /**
     * Helper method that reads in valid double input. If text is entered
     * then input is ask for again.
     *
     * @param prompt message to print for the prompt
     * @return double value read in from the keyboard
     */
    public static double getDouble(String prompt)
    {
        boolean isValid = false;
        double value = 0.0;
        while(!isValid)
        {
            System.out.print(prompt);
            if(input.hasNextDouble())
            {
                value = input.nextDouble();
                isValid = true;
                input.nextLine();
            }
            else
            {
                System.out.println("Error, must enter a number.");
                input.nextLine(); // clear input
            }
        }
        return value;
    }

    /**
     * Helper method that reads in valid integer input. If text is entered
     * then input is asked for again.
     *
     * @param prompt message to print for the prompt
     * @return integer value read in from the keyboard
     */
    public static int getInt(String prompt)
    {
        boolean isValid = false;
        int value = 0;
        while(!isValid)
        {
            System.out.print(prompt);
            if(input.hasNextInt())
            {
                value = input.nextInt();
                isValid = true;
                input.nextLine();
            }
            else
            {
                System.out.println("Error, must enter a number.");
                input.nextLine(); // clear input
            }
        }
        return value;
    }
}
