// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 10
// @version: November 13th, 2023
/* RESOURCES: Referenced coding examples and book examples. Along with JavaDocs */

/* EXPLANATION: Printable interface  */
package EmployeeBlueprints;

import java.text.NumberFormat;

/**
 * Main Printable interface, contains currency and percent variables
 */
public interface Printable // Printable interface
{
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    NumberFormat percent = NumberFormat.getPercentInstance();
    void print();
}
