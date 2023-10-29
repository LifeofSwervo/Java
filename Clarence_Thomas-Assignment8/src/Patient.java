//

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class Patient {
    private int patientID;
    private String lastName;
    private String firstName;
    private String address;
    private String gender;
    private double weight;
    private int[] height; // make this an array with feet and inches
    private String[] dateOfBirth; // stored in MM/DD/YYYY -
    private String stateID;  // use for verifying person ?

    private static NumberFormat decimals = NumberFormat.getNumberInstance();

    public Patient(int patientID, String firstName, String lastName, String address, String gender, double weight, int[] height, String[] dateOfBirth, String stateID) {
        this.patientID = patientID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
        this.stateID = stateID;
        decimals.setMaximumFractionDigits(2);
    }

    // new patients, enter in the rest when they arrive for the visit
    public Patient(int patientID, String lastName, String firstName, String address, String gender) {
        this.patientID = patientID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.gender = gender;
        weight = 0;
        height = new int[]{0, 0};
        dateOfBirth = new String[]{"", "", ""};
        stateID = "";
        decimals.setMaximumFractionDigits(2);
    }

    // default blank constructor
    public Patient() {
        patientID = 0;
        lastName = "";
        firstName = "";
        address = "";
        gender = "";
        weight = 0;
        height = new int[]{0, 0};
        dateOfBirth = new String[]{"", "", ""};
        stateID = "";
        decimals.setMaximumFractionDigits(2);
    }

    // copy constructor
    public Patient(Patient p) {
        patientID = p.getPatientID();
        lastName = p.getLastName();
        firstName = p.getFirstName();
        address = p.getAddress();
        gender = p.getGender();
        weight = p.getWeight();
        height = p.getHeight();
        dateOfBirth = p.getDateOfBirth();
        stateID = p.getStateID();
        decimals.setMaximumFractionDigits(2);
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int[] getHeight() {
        return height;
    }

    public void setHeight(int[] height) {
        if (height.length == 2 && height[1] < 12) {
            this.height = height;
        }
    }

    public String[] getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String[] dateOfBirth) {
        if (dateOfBirth.length == 3) {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public String getStateID() {
        return stateID;
    }

    public void setStateID(String driversLicense) {
        this.stateID = driversLicense;
    }

    public String formattedDateOfBirth() {
        return dateOfBirth[0] + "/" + dateOfBirth[1] + "/" + dateOfBirth[2];
    }

    public int calculateAge() {
        // new date object for current year
        //subtract from year in dob
        int currentYear = LocalDate.now().getYear();
        int currentMonth = LocalDate.now().getMonthValue();
        int currentDay = LocalDate.now().getDayOfMonth();
        int age = currentYear - Integer.parseInt(dateOfBirth[2]); // approximate age, but check months
        if (Integer.parseInt(dateOfBirth[0]) > currentMonth) {
            return age-1;
        }
        else if (Integer.parseInt(dateOfBirth[0]) == currentMonth && Integer.parseInt(dateOfBirth[1]) < currentDay) {
            return age-1;
        }

        return age;

    }

    // weight/height^2 * 703
    public String calculateBMI() {
        double bmi = weight / Math.pow(height[0]*12+height[1], 2) * 703;
        return decimals.format(bmi);
    }

    public String calculateBMI(boolean val) {
        double bmi = weight / Math.pow(height[0]*12+height[1], 2) * 703;
        if (bmi < 18.5) {
            return "Underweight Range";
        }
        else if (bmi > 30) {
            return "Obesity Range";
        }
        else if (bmi > 25) {
            return "Overweight Range";
        }
        else {
            return "Healthy Range";
        }
    }

    public void printPatient() {
        System.out.println("ID: " + patientID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Height: " + height[0]+ "ft " + height[1] + "in");
        System.out.println("DOB: " + formattedDateOfBirth());
        System.out.println("State License/ID: " + stateID);
    }
