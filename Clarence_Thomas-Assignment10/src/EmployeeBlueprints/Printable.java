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
