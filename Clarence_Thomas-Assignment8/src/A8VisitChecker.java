/** Author:  Lucas Hartman
 *  Class:  INFO 1521 - Java 1
 *  Version 1.0.0
 *
 *  Purpose:  This file is a tester for Assignment 8 on the employee system. Use this to
 *            test your code.  The output from this file should match what is shown in the
 *            assignment page on canvas.  If something is off, modify your Employee file as needed.
 *
 *  ***********************    DO NOT MODIFY ******************************
 */

public class A8VisitChecker {

    public static void main(String[] args)
    {
        // setup patients
        Patient patient1 = new Patient(3781, "Bruce", "Banner", "890 5th Ave, Manhattan, New York 10451", "Male", 128, new int[]{5, 8}, new String[]{"12", "18", "1969"}, "HLK0519623596");
        Patient patient2 = new Patient(5632, "Tony", "Stark", "10880 Malibu Point, Malibu, CA 90265", "Male", 185, new int[]{5, 9}, new String[]{"05", "29", "1970"}, "IM1100442092");
        Patient patient3 = new Patient(6541, "Scott", "Lang", "601 Buena Vista Avenue West, Buena Vista, CA 95640", "Male", 185, new int[]{6, 0}, new String[]{"08", "02", "1968"}, "AM526980025");

        Visit starterVisit = new Visit("05/05/2012", "Steven Strange", 130, new int[]{5, 8}, "First check after the Battle of New York", "800mg Ibuprofen");

        System.out.println(" *** Assignment 8 Visit Checker *** ");
        System.out.println("\n ** Initial Patient Information **");
        patient1.printPatient();
        System.out.println();
        patient2.printPatient();
        System.out.println();
        patient3.printPatient();
        System.out.println();

        patient1.addNewVisit(starterVisit);
        patient2.addNewVisit(starterVisit);
        patient3.addNewVisit(starterVisit);

        patient1.addNewVisit(new Visit("07/24/2012", "Daniel Jefferson", 132, new int[]{5, 8}, "Check in on Bruce after a couple months to see how he is doing. No complaints of pain.", "none"));

        patient2.addNewVisit(new Visit("11/10/2012", "Jackie Roysenberg", 195, new int[]{5, 9}, "Check in with Tony after six months. Having issues with sleeping and nightmares.", "Quviviq 50mg"));

        patient3.addNewVisit(new Visit("04/12/2016", "Michael Markevic", 180, new int[]{6, 0}, "Needs high nutrients after sizing up. Citrus helps, needs prescription vitamins.", "Ascorbic Acid 250mg"));

        // print out the visits



        System.out.println("\n   * " + patient1.getFirstName() + " " + patient1.getLastName() + " *");
        patient1.printPatientHistory();

        System.out.println("\n   * " + patient2.getFirstName() + " " + patient2.getLastName() + " *");
        patient2.printPatientHistory();

        System.out.println("\n   * " + patient3.getFirstName() + " " + patient3.getLastName() + " *");
        patient3.printPatientHistory();

        // scott lang wasn't at the battle of new york, remove
        patient3.removeVisit(starterVisit);
        System.out.println("\n   * Updated " + patient3.getFirstName() + " " + patient3.getLastName() + " *");
        patient3.printPatientHistory();

        // test remove via index
        patient1.removeVisit(10);
        patient1.removeVisit(-5);
        patient1.removeVisit(1);

        System.out.println("\n   * " + patient1.getFirstName() + " " + patient1.getLastName() + " *");
        patient1.printPatientHistory();

        System.out.println("\n ** Check for Weight Updated After Visits **");
        patient1.printPatient();
        System.out.println();
        patient2.printPatient();
        System.out.println();
        patient3.printPatient();
        System.out.println();


    }
}
// **********************   DO NOT MODIFY ***************************