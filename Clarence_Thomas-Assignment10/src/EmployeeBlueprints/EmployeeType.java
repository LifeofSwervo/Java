// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 10
// @version: November 13th, 2023
/* RESOURCES: Referenced coding examples and book examples. Along with JavaDocs */

/* EXPLANATION: Employee Type enumeration, used for Hourly, Salary and Commission related info  */
package EmployeeBlueprints;

/**
 * Main employee type enumeration containing HOURLY, SALARY and COMMISSION
 */
public enum EmployeeType
{
    HOURLY,
    SALARY,
    COMMISSION;

    /**
     * Returns Hourly if ordinal is 0, Salary if it is 1, and Commission if it is 2
     */
    @Override
    public String toString()
    {
        int ordinal = this.ordinal();
        if (ordinal ==  0)
        {
            return "Hourly";
        } else if (ordinal == 1 )
        {
            return "Salary";
        } else if (ordinal == 2 )
        {
            return "Commission";
        } else
        {
            return "Error: Ordinal value not between 0-2.";
        }
    }
}


